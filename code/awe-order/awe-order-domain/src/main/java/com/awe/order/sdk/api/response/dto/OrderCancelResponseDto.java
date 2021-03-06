package com.awe.order.sdk.api.response.dto;

import com.awe.order.domain.OrdersItems;
import com.hbird.common.sdk.api.dto.HbirdDto;
import java.util.Date;
import java.util.List;

/**
 * OrderCancelResponseDto：订单取消返回对象Dto<br/>
 * 提供rest接口时方法的返回对象
 * 
 * @author ljz
 * @version 2014-12-23 10:58:06
 * 
 */
public class OrderCancelResponseDto extends HbirdDto {

    /** 序列化标识 */
    private static final long serialVersionUID = 1L;
    
    /** 自增id */
    private Long id; 
    /** 退款单号 */
    private String refund; 
    /** 501:待审核;502:退款中;503:已退款;503:审核驳回;504:退款失败; */
    private Integer status; 
    /** 订单编号 */
    private String orderNo; 
    /** 退款金额 */
    private Double refundAmount; 
    /** 取消原因 */
    private String cancelReason; 
    /** 取消类型 */
    private Integer cancelType; 
    /** 审核人姓名 */
    private String currentAuditName; 
    /** 审核人编号 */
    private String currentAuditNo; 
    /** 0：不通过；1：通过 */
    private Long isAuditing; 
    /** 审核时间 */
    private Date auditingTime; 
    /** 退款完成时间 */
    private Date finishTime; 
    /** 审核意见 */
    private String remark; 
    /** 0:不需要;1需要 */
    private Integer isRefund; 
    /** 创建人姓名 */
    private String createUser; 
    /** 修改人姓名 */
    private String updateUser; 
    /** 创建时间 */
    private Date createTime; 
    /** 修改时间 */
    private Date updateTime; 
    /** 1:有效;0:无效 */
    private Integer yn; 
    /**支付方式 1:货到付款;2:在线支付;3:公司转账;4:邮局汇款 */
    private Integer payWay;
    /**用户ID*/
    private Long userId;
    /** 销售商 */
    private String seller; 
    /** 销售商编号*/
    private String sellerNo;
    
    /**订单明细数据集*/
    private List<OrdersItems> ordersItemsList;
    /**
     * get 自增id
     * 
     * @return the id
     */
    public Long getId(){
        return id;
    }
        
    /**
     * set 自增id
     * 
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * get 退款单号
     * 
     * @return the refund
     */
    public String getRefund(){
        return refund;
    }
        
    /**
     * set 退款单号
     * 
     * @param refund the refund to set
     */
    public void setRefund(String refund) {
        this.refund = refund;
    }
    
    /**
     * get 501:待审核;502:退款中;503:已退款;503:审核驳回;504:退款失败;
     * 
     * @return the status
     */
    public Integer getStatus(){
        return status;
    }
        
    /**
     * set 501:待审核;502:退款中;503:已退款;503:审核驳回;504:退款失败;
     * 
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    /**
     * get 订单编号
     * 
     * @return the orderNo
     */
    public String getOrderNo(){
        return orderNo;
    }
        
    /**
     * set 订单编号
     * 
     * @param orderNo the orderNo to set
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    
    /**
     * get 退款金额
     * 
     * @return the refundAmount
     */
    public Double getRefundAmount(){
        return refundAmount;
    }
        
    /**
     * set 退款金额
     * 
     * @param refundAmount the refundAmount to set
     */
    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }
    
    /**
     * get 取消原因
     * 
     * @return the cancelReason
     */
    public String getCancelReason(){
        return cancelReason;
    }
        
    /**
     * set 取消原因
     * 
     * @param cancelReason the cancelReason to set
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
    
    /**
     * get 取消类型
     * 
     * @return the cancelType
     */
    public Integer getCancelType(){
        return cancelType;
    }
        
    /**
     * set 取消类型
     * 
     * @param cancelType the cancelType to set
     */
    public void setCancelType(Integer cancelType) {
        this.cancelType = cancelType;
    }
    
    /**
     * get 审核人姓名
     * 
     * @return the currentAuditName
     */
    public String getCurrentAuditName(){
        return currentAuditName;
    }
        
    /**
     * set 审核人姓名
     * 
     * @param currentAuditName the currentAuditName to set
     */
    public void setCurrentAuditName(String currentAuditName) {
        this.currentAuditName = currentAuditName;
    }
    
    /**
     * get 审核人编号
     * 
     * @return the currentAuditNo
     */
    public String getCurrentAuditNo(){
        return currentAuditNo;
    }
        
    /**
     * set 审核人编号
     * 
     * @param currentAuditNo the currentAuditNo to set
     */
    public void setCurrentAuditNo(String currentAuditNo) {
        this.currentAuditNo = currentAuditNo;
    }
    
    /**
     * get 0：不通过；1：通过
     * 
     * @return the isAuditing
     */
    public Long getIsAuditing(){
        return isAuditing;
    }
        
    /**
     * set 0：不通过；1：通过
     * 
     * @param isAuditing the isAuditing to set
     */
    public void setIsAuditing(Long isAuditing) {
        this.isAuditing = isAuditing;
    }
    
    /**
     * get 审核时间
     * 
     * @return the auditingTime
     */
    public Date getAuditingTime(){
        return auditingTime;
    }
        
    /**
     * set 审核时间
     * 
     * @param auditingTime the auditingTime to set
     */
    public void setAuditingTime(Date auditingTime) {
        this.auditingTime = auditingTime;
    }
    
    /**
     * get 退款完成时间
     * 
     * @return the finishTime
     */
    public Date getFinishTime(){
        return finishTime;
    }
        
    /**
     * set 退款完成时间
     * 
     * @param finishTime the finishTime to set
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
    
    /**
     * get 审核意见
     * 
     * @return the remark
     */
    public String getRemark(){
        return remark;
    }
        
    /**
     * set 审核意见
     * 
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    /**
     * get 0:不需要;1需要
     * 
     * @return the isRefund
     */
    public Integer getIsRefund(){
        return isRefund;
    }
        
    /**
     * set 0:不需要;1需要
     * 
     * @param isRefund the isRefund to set
     */
    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }
    
    /**
     * get 创建人姓名
     * 
     * @return the createUser
     */
    public String getCreateUser(){
        return createUser;
    }
        
    /**
     * set 创建人姓名
     * 
     * @param createUser the createUser to set
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    
    /**
     * get 修改人姓名
     * 
     * @return the updateUser
     */
    public String getUpdateUser(){
        return updateUser;
    }
        
    /**
     * set 修改人姓名
     * 
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    
    /**
     * get 创建时间
     * 
     * @return the createTime
     */
    public Date getCreateTime(){
        return createTime;
    }
        
    /**
     * set 创建时间
     * 
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * get 修改时间
     * 
     * @return the updateTime
     */
    public Date getUpdateTime(){
        return updateTime;
    }
        
    /**
     * set 修改时间
     * 
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
     * get 1:有效;0:无效
     * 
     * @return the yn
     */
    public Integer getYn(){
        return yn;
    }
        
    /**
     * set 1:有效;0:无效
     * 
     * @param yn the yn to set
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }
	
    /**
     * get 销售商
     * 
     * @return the seller
     */
	public String getSeller() {
		return seller;
	}

	/**
     * set 销售商
     * 
     * @param seller the seller to set
     */
	public void setSeller(String seller) {
		this.seller = seller;
	}

	/**
     * get 销售商编号
     * 
     * @return the seller
     */
	public String getSellerNo() {
		return sellerNo;
	}

	/**
     * set 销售商
     * 
     * @param sellerNo the sellerNo to set
     */
	public void setSellerNo(String sellerNo) {
		this.sellerNo = sellerNo;
	}

	/**
     * get 支付方式 1:货到付款;2:在线支付;3:公司转账;4:邮局汇款
     * 
     * @return the payWay
     */
	public Integer getPayWay() {
		return payWay;
	}

	/**
     * set 支付方式 1:货到付款;2:在线支付;3:公司转账;4:邮局汇款
     * 
     * @param payWay the payWay to set
     */
	public void setPayWay(Integer payWay) {
		this.payWay = payWay;
	}

	/**
     * get 用户id
     * 
     * @return the userId
     */
	public Long getUserId() {
		return userId;
	}

	/**
     * set 用户id
     * 
     * @param userId the userId to set
     */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 订单明细
	 * @return
	 */
	public List<OrdersItems> getOrdersItemsList() {
		return ordersItemsList;
	}
	/**
	 * 订单明细
	 * @param ordersItemsList
	 */
	public void setOrdersItemsList(List<OrdersItems> ordersItemsList) {
		this.ordersItemsList = ordersItemsList;
	}
	
	
}
