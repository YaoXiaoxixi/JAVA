package com.greenplatform.dao;

import com.greenplatform.model.TGreenGoldDzhz;
import com.greenplatform.model.TGreenGoldDzhzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGreenGoldDzhzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    int countByExample(TGreenGoldDzhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    int deleteByExample(TGreenGoldDzhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cUserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    int insert(TGreenGoldDzhz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    int insertSelective(TGreenGoldDzhz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    List<TGreenGoldDzhz> selectByExample(TGreenGoldDzhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    TGreenGoldDzhz selectByPrimaryKey(String cUserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TGreenGoldDzhz record, @Param("example") TGreenGoldDzhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TGreenGoldDzhz record, @Param("example") TGreenGoldDzhzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TGreenGoldDzhz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzhz
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TGreenGoldDzhz record);
}