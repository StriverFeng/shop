package com.mission.shop.product.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ProductComment implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.product_id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Long productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.order_id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Long orderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.user_id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.user_name
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.similar
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Short similar;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.attitude
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Short attitude;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.speed
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Short speed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private String comment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.status
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Short status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.create_time
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.update_time
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_comment.shop_reply
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private byte[] shopReply;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.id
	 * @return  the value of product_comment.id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.id
	 * @param id  the value for product_comment.id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.product_id
	 * @return  the value of product_comment.product_id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.product_id
	 * @param productId  the value for product_comment.product_id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.order_id
	 * @return  the value of product_comment.order_id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.order_id
	 * @param orderId  the value for product_comment.order_id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.user_id
	 * @return  the value of product_comment.user_id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.user_id
	 * @param userId  the value for product_comment.user_id
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.user_name
	 * @return  the value of product_comment.user_name
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.user_name
	 * @param userName  the value for product_comment.user_name
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.similar
	 * @return  the value of product_comment.similar
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Short getSimilar() {
		return similar;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.similar
	 * @param similar  the value for product_comment.similar
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setSimilar(Short similar) {
		this.similar = similar;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.attitude
	 * @return  the value of product_comment.attitude
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Short getAttitude() {
		return attitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.attitude
	 * @param attitude  the value for product_comment.attitude
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setAttitude(Short attitude) {
		this.attitude = attitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.speed
	 * @return  the value of product_comment.speed
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Short getSpeed() {
		return speed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.speed
	 * @param speed  the value for product_comment.speed
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setSpeed(Short speed) {
		this.speed = speed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.comment
	 * @return  the value of product_comment.comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.comment
	 * @param comment  the value for product_comment.comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.status
	 * @return  the value of product_comment.status
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.status
	 * @param status  the value for product_comment.status
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.create_time
	 * @return  the value of product_comment.create_time
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.create_time
	 * @param createTime  the value for product_comment.create_time
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.update_time
	 * @return  the value of product_comment.update_time
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.update_time
	 * @param updateTime  the value for product_comment.update_time
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_comment.shop_reply
	 * @return  the value of product_comment.shop_reply
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public byte[] getShopReply() {
		return shopReply;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_comment.shop_reply
	 * @param shopReply  the value for product_comment.shop_reply
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	public void setShopReply(byte[] shopReply) {
		this.shopReply = shopReply;
	}
}