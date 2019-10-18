package com.greenplatform.dao;

import com.greenplatform.model.PlateYwLxMenu;
import com.greenplatform.model.PlateYwLxMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlateYwLxMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    int countByExample(PlateYwLxMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    int deleteByExample(PlateYwLxMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cMenudm);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    int insert(PlateYwLxMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    int insertSelective(PlateYwLxMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    List<PlateYwLxMenu> selectByExample(PlateYwLxMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    PlateYwLxMenu selectByPrimaryKey(String cMenudm);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PlateYwLxMenu record, @Param("example") PlateYwLxMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PlateYwLxMenu record, @Param("example") PlateYwLxMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PlateYwLxMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlateYwLxMenu record);
}