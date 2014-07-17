package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.ProductCat;
import com.mission.shop.product.dao.model.ProductCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCatMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int countByExample(ProductCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int deleteByExample(ProductCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int insert(ProductCat record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int insertSelective(ProductCat record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	List<ProductCat> selectByExample(ProductCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	ProductCat selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByExampleSelective(@Param("record") ProductCat record,
			@Param("example") ProductCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByExample(@Param("record") ProductCat record,
			@Param("example") ProductCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByPrimaryKeySelective(ProductCat record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_cat
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByPrimaryKey(ProductCat record);
}