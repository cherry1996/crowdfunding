package com.xhp.crowdfunding.entity;

public class Projectclassification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectclassification.Pcid
     *
     * @mbg.generated
     */
    private String pcid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectclassification.Pcname
     *
     * @mbg.generated
     */
    private String pcname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectclassification.Pcnumber
     *
     * @mbg.generated
     */
    private Integer pcnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectclassification.Pcimage
     *
     * @mbg.generated
     */
    private String pcimage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectclassification.Pcid
     *
     * @return the value of projectclassification.Pcid
     *
     * @mbg.generated
     */
    public String getPcid() {
        return pcid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectclassification.Pcid
     *
     * @param pcid the value for projectclassification.Pcid
     *
     * @mbg.generated
     */
    public void setPcid(String pcid) {
        this.pcid = pcid == null ? null : pcid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectclassification.Pcname
     *
     * @return the value of projectclassification.Pcname
     *
     * @mbg.generated
     */
    public String getPcname() {
        return pcname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectclassification.Pcname
     *
     * @param pcname the value for projectclassification.Pcname
     *
     * @mbg.generated
     */
    public void setPcname(String pcname) {
        this.pcname = pcname == null ? null : pcname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectclassification.Pcnumber
     *
     * @return the value of projectclassification.Pcnumber
     *
     * @mbg.generated
     */
    public Integer getPcnumber() {
        return pcnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectclassification.Pcnumber
     *
     * @param pcnumber the value for projectclassification.Pcnumber
     *
     * @mbg.generated
     */
    public void setPcnumber(Integer pcnumber) {
        this.pcnumber = pcnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectclassification.Pcimage
     *
     * @return the value of projectclassification.Pcimage
     *
     * @mbg.generated
     */
    public String getPcimage() {
        return pcimage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectclassification.Pcimage
     *
     * @param pcimage the value for projectclassification.Pcimage
     *
     * @mbg.generated
     */
    public void setPcimage(String pcimage) {
        this.pcimage = pcimage == null ? null : pcimage.trim();
    }
}