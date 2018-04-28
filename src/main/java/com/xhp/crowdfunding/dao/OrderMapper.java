package com.xhp.crowdfunding.dao;

import com.xhp.crowdfunding.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    Order selectByPrimaryKey(String oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    List<Order> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Order record);
}