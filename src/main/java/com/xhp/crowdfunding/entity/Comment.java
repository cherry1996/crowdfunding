package com.xhp.crowdfunding.entity;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.Cid
     *
     * @mbg.generated
     */
    private String cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.Ccontext
     *
     * @mbg.generated
     */
    private String ccontext;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.CreplyId
     *
     * @mbg.generated
     */
    private String creplyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.Uid
     *
     * @mbg.generated
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.Pid
     *
     * @mbg.generated
     */
    private String pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.Cid
     *
     * @return the value of comment.Cid
     *
     * @mbg.generated
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.Cid
     *
     * @param cid the value for comment.Cid
     *
     * @mbg.generated
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.Ccontext
     *
     * @return the value of comment.Ccontext
     *
     * @mbg.generated
     */
    public String getCcontext() {
        return ccontext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.Ccontext
     *
     * @param ccontext the value for comment.Ccontext
     *
     * @mbg.generated
     */
    public void setCcontext(String ccontext) {
        this.ccontext = ccontext == null ? null : ccontext.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.CreplyId
     *
     * @return the value of comment.CreplyId
     *
     * @mbg.generated
     */
    public String getCreplyid() {
        return creplyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.CreplyId
     *
     * @param creplyid the value for comment.CreplyId
     *
     * @mbg.generated
     */
    public void setCreplyid(String creplyid) {
        this.creplyid = creplyid == null ? null : creplyid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.Uid
     *
     * @return the value of comment.Uid
     *
     * @mbg.generated
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.Uid
     *
     * @param uid the value for comment.Uid
     *
     * @mbg.generated
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.Pid
     *
     * @return the value of comment.Pid
     *
     * @mbg.generated
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.Pid
     *
     * @param pid the value for comment.Pid
     *
     * @mbg.generated
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
}