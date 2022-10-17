package com.kedom.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 艺术品的获取去出售记录(ArtworkChange)实体类
 *
 * @author makejava
 * @since 2022-10-17 18:54:07
 */
public class ArtworkChange implements Serializable {
    private static final long serialVersionUID = 681798638194448760L;
    /**
     * 主键 无业务作用
     */
    private Integer id;
    /**
     * 艺术品id
     */
    private String artworkId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 艺术品数量变化
     */
    private Integer artworkCountChange;
    
    private Date changeDate;
    /**
     * 变化方式  收集/售卖/停止售卖返回的余额。
     */
    private Integer changeMode;


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

    public Integer getArtworkCountChange() {
        return artworkCountChange;
    }

    public void setArtworkCountChange(Integer artworkCountChange) {
        this.artworkCountChange = artworkCountChange;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Integer getChangeMode() {
        return changeMode;
    }

    public void setChangeMode(Integer changeMode) {
        this.changeMode = changeMode;
    }

}

