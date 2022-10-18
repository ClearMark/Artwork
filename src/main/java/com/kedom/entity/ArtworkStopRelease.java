package com.kedom.entity;

import java.io.Serializable;
import lombok.Data;


@Data
/**
 * 停止发布时返回的艺术品表(ArtworkStopRelease)实体类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public class ArtworkStopRelease implements Serializable {
    private static final long serialVersionUID = 575803677696450605L;
    /**
     * 主键 绑定流水表
     */
    private String artworkStopReleaseId;
    
    private String artworkId;
    
    private Integer artworkCount;
    
    private Integer artworkData;
    
    private String artworkReleaseId;


}

