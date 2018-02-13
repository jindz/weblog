package org.jindz.solr;


import org.apache.solr.client.solrj.beans.Field;

public class ScRealTimeResultQuery extends BaseQuery {

	@Field
	private String id;
	@Field
	private String executeNo;
	@Field
	private String businessTypeId;
	@Field
	private String orderCode;
	@Field
	private String memberId;
	@Field
	private String mobile;
	@Field
	private String templateId;
	@Field
	private String templateName;
	@Field
	private String couponTitle;
	@Field
	private String couponCustomTitle;
	@Field
	private String couponNo;
	@Field
	private String couponMoney;
	@Field
	private String couponDesc;
	@Field
	private String couponRuleDesc;
	@Field
	private String discountType;
	@Field
	private String discountDesc;
	@Field
	private String couponBusinessType;
	@Field
	private String couponType;
	@Field
	private String biCouponType;
	@Field
	private String goodsCode;
	@Field
	private String categoryCode;
	@Field
	private String commonCode;
	@Field
	private String couponBeginDate;
	@Field
	private String couponExpireDate;
	@Field
	private String couponStatus;
	@Field
	private String perCustomerTag;
	@Field
	private String goodsNum;
	@Field
	private String sendTime;
	@Field
	private String sendStatus;
	@Field
	private String failurelReason;
	@Field
	private String useCouponStatus;
	@Field
	private String createDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExecuteNo() {
		return executeNo;
	}

	public void setExecuteNo(String executeNo) {
		this.executeNo = executeNo;
	}

	public String getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(String businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getCouponTitle() {
		return couponTitle;
	}

	public void setCouponTitle(String couponTitle) {
		this.couponTitle = couponTitle;
	}

	public String getCouponCustomTitle() {
		return couponCustomTitle;
	}

	public void setCouponCustomTitle(String couponCustomTitle) {
		this.couponCustomTitle = couponCustomTitle;
	}

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getCouponMoney() {
		return couponMoney;
	}

	public void setCouponMoney(String couponMoney) {
		this.couponMoney = couponMoney;
	}

	public String getCouponDesc() {
		return couponDesc;
	}

	public void setCouponDesc(String couponDesc) {
		this.couponDesc = couponDesc;
	}

	public String getCouponRuleDesc() {
		return couponRuleDesc;
	}

	public void setCouponRuleDesc(String couponRuleDesc) {
		this.couponRuleDesc = couponRuleDesc;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getDiscountDesc() {
		return discountDesc;
	}

	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public String getCouponBusinessType() {
		return couponBusinessType;
	}

	public void setCouponBusinessType(String couponBusinessType) {
		this.couponBusinessType = couponBusinessType;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getBiCouponType() {
		return biCouponType;
	}

	public void setBiCouponType(String biCouponType) {
		this.biCouponType = biCouponType;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCommonCode() {
		return commonCode;
	}

	public void setCommonCode(String commonCode) {
		this.commonCode = commonCode;
	}

	public String getCouponBeginDate() {
		return couponBeginDate;
	}

	public void setCouponBeginDate(String couponBeginDate) {
		this.couponBeginDate = couponBeginDate;
	}

	public String getCouponExpireDate() {
		return couponExpireDate;
	}

	public void setCouponExpireDate(String couponExpireDate) {
		this.couponExpireDate = couponExpireDate;
	}

	public String getCouponStatus() {
		return couponStatus;
	}

	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}

	public String getPerCustomerTag() {
		return perCustomerTag;
	}

	public void setPerCustomerTag(String perCustomerTag) {
		this.perCustomerTag = perCustomerTag;
	}

	public String getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getFailurelReason() {
		return failurelReason;
	}

	public void setFailurelReason(String failurelReason) {
		this.failurelReason = failurelReason;
	}

	public String getUseCouponStatus() {
		return useCouponStatus;
	}

	public void setUseCouponStatus(String useCouponStatus) {
		this.useCouponStatus = useCouponStatus;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
