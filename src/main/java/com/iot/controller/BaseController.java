package com.iot.controller;

import com.iot.entity.DeviceInfo;
import com.iot.entity.StationInfo;
import com.iot.service.DeviceService;
import com.iot.utils.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 报表控制器
 *
 * @author cs
 * @date 2021/06/05
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @Resource
    private DeviceService deviceService;

    @RequestMapping("/test")
    String testController() {
        return "Base Hello World";
    }


    /**
     * 保存站点信息参数JSON串如下
     *
     * @param stationInfo
     * @return
     */
    @RequestMapping("/saveStationInfo")
    Result saveStationInfo(@RequestBody StationInfo stationInfo) {
        try {
            deviceService.saveStationInfo(stationInfo);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
        return Result.success();
    }

    /**
     * 获取全部站点信息
     *
     * @return
     */
    @RequestMapping("/getAllStationInfo")
    Result getStationInfoByLonLat() {
        Object data;
        try {
            data = deviceService.getAllStationInfo();
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
        return Result.success("请求成功", data);
    }

    /**
     * 根据站点编号修改站点信息
     *
     * @param stationInfo
     * @return
     */
    @RequestMapping("/updateStationInfo")
    Result getStationInfoByLonLat(@RequestBody StationInfo stationInfo) {
        try {
            deviceService.updateStationInfo(stationInfo);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
        return Result.success("请求成功");
    }

    /**
     * 获取所有设备类别
     *
     * @return
     */
    @RequestMapping("/getAllDeviceType")
    Result getAllDeviceType() {
        Object data;
        try {
            data = deviceService.getAllDeviceType();
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
        return Result.success("请求成功", data);
    }

    /**
     * 保存设备信息
     *
     * @param deviceInfo
     * @return
     */
    @RequestMapping("/saveDeviceInfo")
    Result saveDevice(@RequestBody DeviceInfo deviceInfo) {
        try {
            deviceService.saveDeviceInfo(deviceInfo);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
        return Result.success("请求成功");
    }

    /**
     * 通过站点编号获取设备信息
     *
     * @param stationNo
     * @return
     */
    @RequestMapping("/getDeviceInfoByStationNo")
    Result getDeviceInfoByStationNo(@RequestParam("stationNo") String stationNo) {
        Object data;
        try {
            data = deviceService.getDeviceInfoByStationNo(stationNo);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
        return Result.success("请求成功", data);
    }

    /**
     * 根据站点编号，设备编号更新设备信息
     *
     * @return
     */
    @RequestMapping("/updateDeviceInfo")
    Result updateDeviceInfo(@RequestBody DeviceInfo deviceInfo) {
        try {
            deviceService.updateDeviceInfo(deviceInfo);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
        return Result.success("请求成功");
    }

    /**
     * 获取站点下某个设备的实时数据
     *
     * @param stationNo 站点编号
     * @param deviceNo  设备编号
     * @return
     */
    @RequestMapping("/getDeviceLiveData")
    Result getDeviceLiveData(@RequestParam("stationNo") String stationNo,
                             @RequestParam("deviceNo") Long deviceNo) {
        Object data;
        try {
            data = deviceService.getDeviceLiveData(stationNo, deviceNo);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
        return Result.success("请求成功", data);
    }


}
