package com.csdj.dao.ym;

import com.csdj.entity.SystemConfig;

import java.util.List;


public interface AppurlMapper {
    /*显示App地址信息*/
    List<SystemConfig> getAppConfig();
    /*修改APP地址信息*/
    int updateAppConfig(SystemConfig systemConfig);
}
