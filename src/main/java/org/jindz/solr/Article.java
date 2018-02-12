package org.jindz.solr;

import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;

public class Article extends BaseQuery{
	// 文章id
	@Field
	private String id;
	// 文章分类id
	@Field
	private String categoryId;
	// 作者id
	@Field
	private String authorId;
	// 文章标题
	@Field
	private String name;
	// 文章内容
	@Field
	private String content;
	// 发布时间
	@Field
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	

}
