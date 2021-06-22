package com.iot.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * TODO
 *
 * @author cs
 * @since 2021/06/05
 */
@Data
@Accessors(chain = true)
public class StationInfo implements Serializable {

    /**
     * 站点编号
     */
    private String stationNo;

    /**
     * 站点名称
     */
    private String stationName;

    /**
     * 站点地址
     */
    private String stationAddress;

    /**
     * 处理工艺
     */
    private String processTech;

    /**
     * 处理规模
     */
    private Integer processScale;

    /**
     * 运维人数
     */
    private Integer devOpsNum;

    /**
     * 联系电话
     */
    private String connectTel;

    /**
     * 背景底图路径
     */
    private String bgImgPath;

    /**
     * 备注1
     */
    private String remarks1;

    /**
     * 备注2
     */
    private String remarks2;

    /**
     * 备注3
     */
    private String remarks3;
}
