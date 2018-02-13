package org.jindz.solr;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.solr.client.solrj.response.QueryResponse;

public class Test {

	public static void main(String[] args) {
//		 add();
		query();
	}

	public static void query() {

		ScRealTimeResultQuery query = new ScRealTimeResultQuery();
//		query.setExecuteNo("SEND");
//		query.setFailurelReason("发劵失败");
		try {
			QueryResponse respone = SolrUtil.query(query);
			System.out.println("耗时:" + respone.getQTime() + "");
			System.out.println("数量:" + respone.getResults().getNumFound());
			// List<Article> articleList = respone.getBeans(Article.class);
			// System.out.println(articleList);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void add() {
		ExecutorService exec = Executors.newFixedThreadPool(200);
		for (int i = 0; i < 1000000; i++) {
			final int ii = i;
			Runnable run = new Runnable() {
				public void run() {
					ScRealTimeResultQuery article = new ScRealTimeResultQuery();
					article.setId(UUID.randomUUID().toString());
					article.setBiCouponType(ii+"");
					SolrUtil.saveSolrResource(article);
					System.out.println(ii);
				}
			};
			exec.execute(run);
		}
		exec.shutdown();
		boolean flag = false;
		while (!flag) {
			if (exec.isTerminated()) {
				SolrUtil.commit();
				System.out.println("完成");
				flag = true;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
