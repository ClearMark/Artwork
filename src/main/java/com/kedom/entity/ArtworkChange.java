package com.kedom.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 艺术品的获取去出售记录(ArtworkChange)实体类
 *
 * @author makejava
 * @since 2022-10-18 17:45:53
 */
public class ArtworkChange implements Serializable {
    private static final long serialVersionUID = 282145869996788535L;
    /**
     * 主键 无业务作用
     */
    private String artworkChangeId;
    /**
     * 艺术品id
     */
    private String artworkId;
    /**
     * 用户名
     */
    private String userId;
    /**
     * 艺术品数量变化
     */
    private Integer artworkCountChange;
    
    private Date changeDate;
    /**
     * 变化方式  收集/售卖/停止售卖返回的余额。
     */
    private Integer changeMode;


    public String getArtworkChangeId() {
        return artworkChangeId;
    }

    public void setArtworkChangeId(String artworkChangeId) {
        this.artworkChangeId = artworkChangeId;
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

