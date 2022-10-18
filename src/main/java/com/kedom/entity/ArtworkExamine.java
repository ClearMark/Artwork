package com.kedom.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;


@Data
/**
 * 艺术品审批表(ArtworkExamine)实体类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public class ArtworkExamine implements Serializable {
    private static final long serialVersionUID = -12437529544630630L;
    /**
     * 艺术品编号
     */
    private String artworkId;
    /**
     * 艺术品名称
     */
    private String artworkName;
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
     * 艺术品发布时间
     */
    private LocalDateTime artworkReleaseDate;
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
    private LocalDateTime examineDate;
    /**
     * 审核状态 1 通过  2 未通过  3 审核中
     */
    private Integer examineState;


}

