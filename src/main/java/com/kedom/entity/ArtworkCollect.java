package com.kedom.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;


@Data
/**
 * 艺术品收集表(ArtworkCollect)实体类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public class ArtworkCollect implements Serializable {
    private static final long serialVersionUID = 593437053858106732L;
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
    private LocalDateTime artworkCollectDate;


}

