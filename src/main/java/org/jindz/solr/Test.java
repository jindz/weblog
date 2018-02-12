package org.jindz.solr;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;


public class Test {
	
	
	public static void main(String[] args) {
		add();
	}
	
	public static void add(){
		
		
		
		ExecutorService exec = Executors.newFixedThreadPool(200);
		for (int i = 0; i < 1000000; i++) {
			final int ii = i;
			Runnable run = new Runnable() {
				public void run() {
					
					Article article = new Article();
				    article.setId(UUID.randomUUID().toString());
				    article.setName("批量插入的数据"+ii);
				    article.setContent("湖南省长沙市岳麓区"+ii);
				    article.setCreateTime(new Date());
				    SolrUtil.saveSolrResource(article);
				    System.out.println(ii);
				}
			};
			exec.execute(run);
		}
		exec.shutdown();
		
		boolean flag = false;
		while (!flag) {
			if(exec.isTerminated()){
				SolrUtil.commit();
				System.out.println("完成");
				flag = true;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void query(){

		
	    try {
	        QueryResponse respone = SolrUtil.query("content:湖南");
	        List<Article> articleList = respone.getBeans(Article.class);
	        System.out.println(articleList);
	    } catch (SolrServerException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	
	}
	
	

}
