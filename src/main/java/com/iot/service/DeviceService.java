package com.iot.service;

import com.iot.entity.Device;
import com.iot.entity.DeviceInfo;
import com.iot.entity.StationInfo;

import java.util.List;

/**
 * TODO
 *
 * @author cs
 * @since 2020/11/17 15:35
 */
public interface DeviceService {


    /**
     * 存储站点信息
     *
     * @param stationInfo
     */
    void saveStationInfo(StationInfo stationInfo);

    /**
     * 根据站点编号修改站点信息
     * @param stationInfo
     */
    void updateStationInfo(StationInfo stationInfo);

    /**
     * 根据经纬度获取站点信息集合
     * @param stationLon
     * @param stationLat
     * @return
     */
    List<StationInfo> getStationInfoByLonLat(Double stationLon, Double stationLat);

    /**
     * 存储设备主信息
     *
     * @param param 参数
     */
    void saveDevice(Device param);


    /**
     * 更新相同站点相同设备参数计数
     *
     * @param endReceiveTime   最后接收时间
     * @param stationNo        站点编号
     * @param varListFieldsMd5 参数变量值MD5
     */
    void updateSameDeviceCounter(String endReceiveTime,
                                 String stationNo,
                                 String varListFieldsMd5);


    /**
     * 检查varListMd5是否存在
     *
     * @param stationNo
     * @param varListFieldsMd5
     * @return total
     */
    Long checkDeviceExist(String stationNo, String varListFieldsMd5);


    /**
     * 获取站点下所有设备种类信息
     *
     * @param stationNo 站点
     * @return List
     */
    List<DeviceInfo> getDeviceInfoAll(String stationNo);

    /**
     * 获取扩展表数据
     *
     * @return list
     */
    List<Device> getDeviceAll();

}
