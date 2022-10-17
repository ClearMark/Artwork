package com.kedom.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 艺术品收集表(ArtworkCollect)实体类
 *
 * @author makejava
 * @since 2022-10-17 18:33:26
 */
public class ArtworkCollect implements Serializable {
    private static final long serialVersionUID = -64852720506978592L;
    /**
     * 主键 无业务作用
     */
    private Integer id;
    /**
     * 艺术品编号
     */
    private String artworkId;
    /**
     * 收集者账号
     */
    private String username;
    /**
     * 获取时间
     */
    private Date artworkCollectDate;
    /**
     * 收集艺术品代码
     */
    private String collectCode;


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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getArtworkCollectDate() {
        return artworkCollectDate;
    }

    public void setArtworkCollectDate(Date artworkCollectDate) {
        this.artworkCollectDate = artworkCollectDate;
    }

    public String getCollectCode() {
        return collectCode;
    }

    public void setCollectCode(String collectCode) {
        this.collectCode = collectCode;
    }

}

