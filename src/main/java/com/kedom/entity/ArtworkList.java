package com.kedom.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;


@Data
/**
 * 艺术品目录(ArtworkList)实体类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public class ArtworkList implements Serializable {
    private static final long serialVersionUID = 204841789591238385L;
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
    private LocalDateTime artworkReleaseDate;


}

