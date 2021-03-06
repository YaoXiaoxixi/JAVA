package com.plate.publicmag.model;

import java.io.Serializable;

public class TSystemMenu implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_menu.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_menu.parent_id
     *
     * @mbggenerated
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_menu.menu_level
     *
     * @mbggenerated
     */
    private Integer menuLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_menu.menu_name
     *
     * @mbggenerated
     */
    private String menuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_menu.menu_icon
     *
     * @mbggenerated
     */
    private String menuIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_menu.menu_action
     *
     * @mbggenerated
     */
    private String menuAction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_menu.menu_sort
     *
     * @mbggenerated
     */
    private Integer menuSort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_menu.is_show
     *
     * @mbggenerated
     */
    private Integer isShow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_system_menu
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_menu.id
     *
     * @return the value of t_system_menu.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_menu.id
     *
     * @param id the value for t_system_menu.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_menu.parent_id
     *
     * @return the value of t_system_menu.parent_id
     *
     * @mbggenerated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_menu.parent_id
     *
     * @param parentId the value for t_system_menu.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_menu.menu_level
     *
     * @return the value of t_system_menu.menu_level
     *
     * @mbggenerated
     */
    public Integer getMenuLevel() {
        return menuLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_menu.menu_level
     *
     * @param menuLevel the value for t_system_menu.menu_level
     *
     * @mbggenerated
     */
    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_menu.menu_name
     *
     * @return the value of t_system_menu.menu_name
     *
     * @mbggenerated
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_menu.menu_name
     *
     * @param menuName the value for t_system_menu.menu_name
     *
     * @mbggenerated
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_menu.menu_icon
     *
     * @return the value of t_system_menu.menu_icon
     *
     * @mbggenerated
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_menu.menu_icon
     *
     * @param menuIcon the value for t_system_menu.menu_icon
     *
     * @mbggenerated
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_menu.menu_action
     *
     * @return the value of t_system_menu.menu_action
     *
     * @mbggenerated
     */
    public String getMenuAction() {
        return menuAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_menu.menu_action
     *
     * @param menuAction the value for t_system_menu.menu_action
     *
     * @mbggenerated
     */
    public void setMenuAction(String menuAction) {
        this.menuAction = menuAction == null ? null : menuAction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_menu.menu_sort
     *
     * @return the value of t_system_menu.menu_sort
     *
     * @mbggenerated
     */
    public Integer getMenuSort() {
        return menuSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_menu.menu_sort
     *
     * @param menuSort the value for t_system_menu.menu_sort
     *
     * @mbggenerated
     */
    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_menu.is_show
     *
     * @return the value of t_system_menu.is_show
     *
     * @mbggenerated
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_menu.is_show
     *
     * @param isShow the value for t_system_menu.is_show
     *
     * @mbggenerated
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_menu
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", menuLevel=").append(menuLevel);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuIcon=").append(menuIcon);
        sb.append(", menuAction=").append(menuAction);
        sb.append(", menuSort=").append(menuSort);
        sb.append(", isShow=").append(isShow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}