package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.ProductKind;
import com.mission.shop.product.dao.model.ProductKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductKindMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int countByExample(ProductKindExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int deleteByExample(ProductKindExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int deleteByPrimaryKey(Long kindId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int insert(ProductKind record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int insertSelective(ProductKind record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	List<ProductKind> selectByExample(ProductKindExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	ProductKind selectByPrimaryKey(Long kindId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByExampleSelective(@Param("record") ProductKind record,
			@Param("example") ProductKindExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByExample(@Param("record") ProductKind record,
			@Param("example") ProductKindExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByPrimaryKeySelective(ProductKind record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_kind
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByPrimaryKey(ProductKind record);
}