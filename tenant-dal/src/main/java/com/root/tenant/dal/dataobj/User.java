package com.root.tenant.dal.dataobj;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mobile
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_frozen_time
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private Date lastFrozenTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.creator
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.updator
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    private String updator;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mobile
     *
     * @return the value of user.mobile
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mobile
     *
     * @param mobile the value for user.mobile
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_frozen_time
     *
     * @return the value of user.last_frozen_time
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public Date getLastFrozenTime() {
        return lastFrozenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_frozen_time
     *
     * @param lastFrozenTime the value for user.last_frozen_time
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setLastFrozenTime(Date lastFrozenTime) {
        this.lastFrozenTime = lastFrozenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.creator
     *
     * @return the value of user.creator
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.creator
     *
     * @param creator the value for user.creator
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.updator
     *
     * @return the value of user.updator
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.updator
     *
     * @param updator the value for user.updator
     *
     * @mbggenerated Wed Oct 19 16:18:34 CST 2016
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }
}