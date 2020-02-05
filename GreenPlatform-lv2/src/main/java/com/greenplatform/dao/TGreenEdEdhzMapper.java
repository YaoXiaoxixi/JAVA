package com.greenplatform.dao;

import com.greenplatform.model.TGreenEdEdhz;
import com.greenplatform.model.TGreenEdEdhzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGreenEdEdhzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    int countByExample(TGreenEdEdhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    int deleteByExample(TGreenEdEdhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cUserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    int insert(TGreenEdEdhz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    int insertSelective(TGreenEdEdhz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    List<TGreenEdEdhz> selectByExample(TGreenEdEdhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    TGreenEdEdhz selectByPrimaryKey(String cUserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TGreenEdEdhz record, @Param("example") TGreenEdEdhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TGreenEdEdhz record, @Param("example") TGreenEdEdhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TGreenEdEdhz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edhz
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TGreenEdEdhz record);
}