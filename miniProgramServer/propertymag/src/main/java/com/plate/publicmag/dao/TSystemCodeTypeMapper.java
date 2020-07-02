package com.plate.publicmag.dao;

import com.plate.publicmag.model.TSystemCodeType;
import com.plate.publicmag.model.TSystemCodeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemCodeTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    int countByExample(TSystemCodeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    int deleteByExample(TSystemCodeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String codeType);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    int insert(TSystemCodeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    int insertSelective(TSystemCodeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    List<TSystemCodeType> selectByExample(TSystemCodeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    TSystemCodeType selectByPrimaryKey(String codeType);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TSystemCodeType record, @Param("example") TSystemCodeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TSystemCodeType record, @Param("example") TSystemCodeTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TSystemCodeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_code_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TSystemCodeType record);
}