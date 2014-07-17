package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.ProductDetail;
import com.mission.shop.product.dao.model.ProductDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDetailMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int countByExample(ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int deleteByExample(ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int deleteByPrimaryKey(Long detailId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int insert(ProductDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int insertSelective(ProductDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	List<ProductDetail> selectByExample(ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	ProductDetail selectByPrimaryKey(Long detailId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByExampleSelective(@Param("record") ProductDetail record,
			@Param("example") ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByExample(@Param("record") ProductDetail record,
			@Param("example") ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByPrimaryKeySelective(ProductDetail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByPrimaryKey(ProductDetail record);
}