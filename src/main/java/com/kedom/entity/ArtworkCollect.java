package com.kedom.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 艺术品收集表(ArtworkCollect)实体类
 *
 * @author makejava
 * @since 2022-10-18 17:45:55
 */
public class ArtworkCollect implements Serializable {
    private static final long serialVersionUID = -45579331081606798L;
    /**
     * 主键 无业务作用
     */
    private String artworkCollectId;
    /**
     * 艺术品编号
     */
    private String artworkId;
    /**
     * 收集者账号
     */
    private String userId;
    /**
     * 收集艺术品代码
     */
    private String collectCode;
    /**
     * 获取时间
     */
    private Date artworkCollectDate;


    public String getArtworkCollectId() {
        return artworkCollectId;
    }

    public void setArtworkCollectId(String artworkCollectId) {
        this.artworkCollectId = artworkCollectId;
    }

    public String getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(String artworkId) {
        this.artworkId = artworkId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCollectCode() {
        return collectCode;
    }

    public void setCollectCode(String collectCode) {
        this.collectCode = collectCode;
    }

    public Date getArtworkCollectDate() {
        return artworkCollectDate;
    }

    public void setArtworkCollectDate(Date artworkCollectDate) {
        this.artworkCollectDate = artworkCollectDate;
    }

}

