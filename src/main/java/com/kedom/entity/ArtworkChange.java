package com.kedom.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;


@Data
/**
 * 艺术品的获取去出售记录(ArtworkChange)实体类
 *
 * @author makejava
 * @since 2022-10-18 23:12:54
 */
public class ArtworkChange implements Serializable {
    private static final long serialVersionUID = 564458737147022382L;
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
    
    private LocalDateTime changeDate;
    /**
     * 变化方式  收集/售卖/停止售卖返回的余额。
     */
    private Integer changeMode;


}

