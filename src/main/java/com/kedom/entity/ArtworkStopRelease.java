package com.kedom.entity;

import java.io.Serializable;

/**
 * 停止发布时返回的艺术品表(ArtworkStopRelease)实体类
 *
 * @author makejava
 * @since 2022-10-18 17:46:01
 */
public class ArtworkStopRelease implements Serializable {
    private static final long serialVersionUID = -51584131149247907L;
    /**
     * 主键 绑定流水表
     */
    private String artworkStopReleaseId;
    
    private String artworkId;
    
    private Integer artworkCount;
    
    private Integer artworkData;
    
    private String artworkReleaseId;


    public String getArtworkStopReleaseId() {
        return artworkStopReleaseId;
    }

    public void setArtworkStopReleaseId(String artworkStopReleaseId) {
        this.artworkStopReleaseId = artworkStopReleaseId;
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

    public Integer getArtworkData() {
        return artworkData;
    }

    public void setArtworkData(Integer artworkData) {
        this.artworkData = artworkData;
    }

    public String getArtworkReleaseId() {
        return artworkReleaseId;
    }

    public void setArtworkReleaseId(String artworkReleaseId) {
        this.artworkReleaseId = artworkReleaseId;
    }

}

