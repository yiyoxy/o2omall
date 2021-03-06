package com.awe.pay.domain;

import java.util.Date;

/**
 * Trade：正向交易实体类
 * 
 * @author ljz
 * @version 2014-12-23 10:06:26
 * 
 */
public class Trade implements java.io.Serializable {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** id自增 */
    private Long id; 
    /** 账号 */
    private String loginNo; 
    /** 账号姓名 */
    private String loginName; 
    /** 通道编号 */
    private Long channelNo; 
    /** 通道名称 */
    private String channelName; 
    /** 订单号 */
    private String orderNo; 
    /** 交易金额 */
    private Double amount; 
    /** 交易时间 */
    private Date tradeTime; 
    /** 交易流水号 */
    private String serialNo; 
    /** 交易状态 */
    private Integer status; 
    /** 支付帐号 */
    private String accountNo; 
    /** 支付人姓名 */
    private String accountName; 
    /** 创建时间 */
    private Date createTime; 
    /** 更新时间 */
    private Date updateTime; 
    /** 创建人id */
    private Long createUserId; 
    /** 创建人 */
    private String createUser; 
    /** 更新人id */
    private Long updateUserId; 
    /** 更新人 */
    private String updateUser; 
    /** 是否有效:1有效;0:无效 */
    private Integer yn; 
    
    /**
     * get id自增
     * 
     * @return the id
     */
    public Long getId(){
        return id;
    }
        
    /**
     * set id自增
     * 
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * get 账号
     * 
     * @return the loginNo
     */
    public String getLoginNo(){
        return loginNo;
    }
        
    /**
     * set 账号
     * 
     * @param loginNo the loginNo to set
     */
    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo;
    }
    
    /**
     * get 账号姓名
     * 
     * @return the loginName
     */
    public String getLoginName(){
        return loginName;
    }
        
    /**
     * set 账号姓名
     * 
     * @param loginName the loginName to set
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    /**
     * get 通道编号
     * 
     * @return the channelNo
     */
    public Long getChannelNo(){
        return channelNo;
    }
        
    /**
     * set 通道编号
     * 
     * @param channelNo the channelNo to set
     */
    public void setChannelNo(Long channelNo) {
        this.channelNo = channelNo;
    }
    
    /**
     * get 通道名称
     * 
     * @return the channelName
     */
    public String getChannelName(){
        return channelName;
    }
        
    /**
     * set 通道名称
     * 
     * @param channelName the channelName to set
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
    
    /**
     * get 订单号
     * 
     * @return the orderNo
     */
    public String getOrderNo(){
        return orderNo;
    }
        
    /**
     * set 订单号
     * 
     * @param orderNo the orderNo to set
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    
    /**
     * get 交易金额
     * 
     * @return the amount
     */
    public Double getAmount(){
        return amount;
    }
        
    /**
     * set 交易金额
     * 
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    /**
     * get 交易时间
     * 
     * @return the tradeTime
     */
    public Date getTradeTime(){
        return tradeTime;
    }
        
    /**
     * set 交易时间
     * 
     * @param tradeTime the tradeTime to set
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }
    
    /**
     * get 交易流水号
     * 
     * @return the serialNo
     */
    public String getSerialNo(){
        return serialNo;
    }
        
    /**
     * set 交易流水号
     * 
     * @param serialNo the serialNo to set
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    
    /**
     * get 交易状态
     * 
     * @return the status
     */
    public Integer getStatus(){
        return status;
    }
        
    /**
     * set 交易状态
     * 
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    /**
     * get 支付帐号
     * 
     * @return the accountNo
     */
    public String getAccountNo(){
        return accountNo;
    }
        
    /**
     * set 支付帐号
     * 
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    
    /**
     * get 支付人姓名
     * 
     * @return the accountName
     */
    public String getAccountName(){
        return accountName;
    }
        
    /**
     * set 支付人姓名
     * 
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
     * get 更新时间
     * 
     * @return the updateTime
     */
    public Date getUpdateTime(){
        return updateTime;
    }
        
    /**
     * set 更新时间
     * 
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
     * get 创建人id
     * 
     * @return the createUserId
     */
    public Long getCreateUserId(){
        return createUserId;
    }
        
    /**
     * set 创建人id
     * 
     * @param createUserId the createUserId to set
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }
    
    /**
     * get 创建人
     * 
     * @return the createUser
     */
    public String getCreateUser(){
        return createUser;
    }
        
    /**
     * set 创建人
     * 
     * @param createUser the createUser to set
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    
    /**
     * get 更新人id
     * 
     * @return the updateUserId
     */
    public Long getUpdateUserId(){
        return updateUserId;
    }
        
    /**
     * set 更新人id
     * 
     * @param updateUserId the updateUserId to set
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }
    
    /**
     * get 更新人
     * 
     * @return the updateUser
     */
    public String getUpdateUser(){
        return updateUser;
    }
        
    /**
     * set 更新人
     * 
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    
    /**
     * get 是否有效:1有效;0:无效
     * 
     * @return the yn
     */
    public Integer getYn(){
        return yn;
    }
        
    /**
     * set 是否有效:1有效;0:无效
     * 
     * @param yn the yn to set
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }
}
