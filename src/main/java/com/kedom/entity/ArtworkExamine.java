package com.kedom.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 艺术品审批表(ArtworkExamine)实体类
 *
 * @author makejava
 * @since 2022-10-17 18:33:27
 */
public class ArtworkExamine implements Serializable {
    private static final long serialVersionUID = 781610501613391964L;
    /**
     * 艺术品编号
     */
    private String artworkId;
    /**
     * 艺术品名称
     */
    private String artworkName;
    /**
     * 艺术品发布时间
     */
    private Date artworkReleaseDate;
    /**
     * 发布数量
     */
    private Integer releaseCount;
    /**
     * 发布艺术品用户
     */
    private String releaseUsername;
    /**
     * 艺术品产地
     */
    private String artworkOrigin;
    /**
     * 艺术品图片链接
     */
    private String artworkImgAddress;
    /**
     * 艺术品等级
     */
    private Integer artworkLevel;
    /**
     * 收集代码
     */
    private String artworkCollectCode;
    /**
     * 审核人id
     */
    private Integer examineAdminId;
    /**
     * 审核时间
     */
    private Date examineDate;
    /**
     * 审核状态 1 通过  2 未通过  3 审核中
     */
    private Integer examineState;


    public String getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(String artworkId) {
        this.artworkId = artworkId;
    }

    public String getArtworkName() {
        return artworkName;
    }

    public void setArtworkName(String artworkName) {
        this.artworkName = artworkName;
    }

    public Date getArtworkReleaseDate() {
        return artworkReleaseDate;
    }

    public void setArtworkReleaseDate(Date artworkReleaseDate) {
        this.artworkReleaseDate = artworkReleaseDate;
    }

    public Integer getReleaseCount() {
        return releaseCount;
    }

    public void setReleaseCount(Integer releaseCount) {
        this.releaseCount = releaseCount;
    }

    public String getReleaseUsername() {
        return releaseUsername;
    }

    public void setReleaseUsername(String releaseUsername) {
        this.releaseUsername = releaseUsername;
    }

    public String getArtworkOrigin() {
        return artworkOrigin;
    }

    public void setArtworkOrigin(String artworkOrigin) {
        this.artworkOrigin = artworkOrigin;
    }

    public String getArtworkImgAddress() {
        return artworkImgAddress;
    }

    public void setArtworkImgAddress(String artworkImgAddress) {
        this.artworkImgAddress = artworkImgAddress;
    }

    public Integer getArtworkLevel() {
        return artworkLevel;
    }

    public void setArtworkLevel(Integer artworkLevel) {
        this.artworkLevel = artworkLevel;
    }

    public String getArtworkCollectCode() {
        return artworkCollectCode;
    }

    public void setArtworkCollectCode(String artworkCollectCode) {
        this.artworkCollectCode = artworkCollectCode;
    }

    public Integer getExamineAdminId() {
        return examineAdminId;
    }

    public void setExamineAdminId(Integer examineAdminId) {
        this.examineAdminId = examineAdminId;
    }

    public Date getExamineDate() {
        return examineDate;
    }

    public void setExamineDate(Date examineDate) {
        this.examineDate = examineDate;
    }

    public Integer getExamineState() {
        return examineState;
    }

    public void setExamineState(Integer examineState) {
        this.examineState = examineState;
    }

}

