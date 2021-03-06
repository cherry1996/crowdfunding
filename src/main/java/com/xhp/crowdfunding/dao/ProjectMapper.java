package com.xhp.crowdfunding.dao;

import com.xhp.crowdfunding.entity.Project;

import java.util.List;

public interface ProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int insert(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int insertSelective(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    Project selectByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Project record);

    List<Project> searchIndex();

    List<Project> searchAll();
}