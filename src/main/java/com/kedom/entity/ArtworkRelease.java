package com.kedom.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;


@Data
/**
 * 艺术品发布表(ArtworkRelease)实体类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public class ArtworkRelease implements Serializable {
    private static final long serialVersionUID = 908566341057633676L;
    /**
     * 主键 无业务意义
     */
    private String artworkReleaseId;
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
    private String artworkReleaseUserId;
    /**
     * 剩下多少艺术品
     */
    private Integer surplusCount;
    /**
     * 发布时间
     */
    private LocalDateTime artworkReleaseData;
    /**
     * 停止发布时间
     */
    private LocalDateTime artworkEndReleaseData;
    /**
     * 发布状态 0 发布者  1已下架
     */
    private Integer releaseState;


}

