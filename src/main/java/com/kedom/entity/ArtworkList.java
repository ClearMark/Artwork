package com.kedom.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 艺术品目录(ArtworkList)实体类
 *
 * @author makejava
 * @since 2022-10-18 17:45:59
 */
public class ArtworkList implements Serializable {
    private static final long serialVersionUID = -52158943021135715L;
    /**
     * 艺术品编号
     */
    private String artworkId;
    /**
     * 艺术品名称
     */
    private String artworkName;
    /**
     * 总计发布数量
     */
    private Integer totalCount;
    /**
     * 首次发布艺术品用户
     */
    private String firstReleaseUsername;
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
     * 艺术品发布时间
     */
    private Date artworkReleaseDate;


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

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getFirstReleaseUsername() {
        return firstReleaseUsername;
    }

    public void setFirstReleaseUsername(String firstReleaseUsername) {
        this.firstReleaseUsername = firstReleaseUsername;
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

    public Date getArtworkReleaseDate() {
        return artworkReleaseDate;
    }

    public void setArtworkReleaseDate(Date artworkReleaseDate) {
        this.artworkReleaseDate = artworkReleaseDate;
    }

}

