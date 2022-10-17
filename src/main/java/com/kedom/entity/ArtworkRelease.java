package com.kedom.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 艺术品发布表(ArtworkRelease)实体类
 *
 * @author makejava
 * @since 2022-10-17 19:02:10
 */
public class ArtworkRelease implements Serializable {
    private static final long serialVersionUID = 236457032926437462L;
    /**
     * 主键 无业务意义
     */
    private Integer id;
    /**
     * 艺术品编号
     */
    private String artworkId;
    /**
     * 艺术品发布数量
     */
    private Integer artworkCount;
    /**
     * 收集艺术品代码
     */
    private String artworkCollectCode;
    /**
     * 艺术品发布人
     */
    private String artworkReleaseUsername;
    /**
     * 剩下多少艺术品
     */
    private Integer surplusCount;
    /**
     * 发布时间
     */
    private Date artworkReleaseData;
    /**
     * 停止发布时间
     */
    private Date artworkEndReleaseData;
    /**
     * 发布状态 0 发布者  1已下架
     */
    private Integer releaseState;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(String artworkId) {
        this.artworkId = artworkId;
    }

    public Integer getArtworkCount() {
        return artworkCount;
    }

    public void setArtworkCount(Integer artworkCount) {
        this.artworkCount = artworkCount;
    }

    public String getArtworkCollectCode() {
        return artworkCollectCode;
    }

    public void setArtworkCollectCode(String artworkCollectCode) {
        this.artworkCollectCode = artworkCollectCode;
    }

    public String getArtworkReleaseUsername() {
        return artworkReleaseUsername;
    }

    public void setArtworkReleaseUsername(String artworkReleaseUsername) {
        this.artworkReleaseUsername = artworkReleaseUsername;
    }

    public Integer getSurplusCount() {
        return surplusCount;
    }

    public void setSurplusCount(Integer surplusCount) {
        this.surplusCount = surplusCount;
    }

    public Date getArtworkReleaseData() {
        return artworkReleaseData;
    }

    public void setArtworkReleaseData(Date artworkReleaseData) {
        this.artworkReleaseData = artworkReleaseData;
    }

    public Date getArtworkEndReleaseData() {
        return artworkEndReleaseData;
    }

    public void setArtworkEndReleaseData(Date artworkEndReleaseData) {
        this.artworkEndReleaseData = artworkEndReleaseData;
    }

    public Integer getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(Integer releaseState) {
        this.releaseState = releaseState;
    }

}

