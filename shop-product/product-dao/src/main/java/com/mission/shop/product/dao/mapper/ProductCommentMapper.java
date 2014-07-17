package com.mission.shop.product.dao.mapper;

import com.mission.shop.product.dao.model.ProductComment;
import com.mission.shop.product.dao.model.ProductCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCommentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int countByExample(ProductCommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int deleteByExample(ProductCommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int insert(ProductComment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int insertSelective(ProductComment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	List<ProductComment> selectByExampleWithBLOBs(ProductCommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	List<ProductComment> selectByExample(ProductCommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	ProductComment selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByExampleSelective(@Param("record") ProductComment record,
			@Param("example") ProductCommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByExampleWithBLOBs(@Param("record") ProductComment record,
			@Param("example") ProductCommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByExample(@Param("record") ProductComment record,
			@Param("example") ProductCommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByPrimaryKeySelective(ProductComment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByPrimaryKeyWithBLOBs(ProductComment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_comment
	 * @mbggenerated  Thu Jul 17 14:40:46 CST 2014
	 */
	int updateByPrimaryKey(ProductComment record);
}