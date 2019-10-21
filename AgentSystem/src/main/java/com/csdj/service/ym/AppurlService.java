package com.csdj.service.ym;

import com.csdj.entity.SystemConfig;

import java.util.List;

public interface AppurlService {
    List<SystemConfig> getAppConfigs();
    int updateAppConfigs(SystemConfig systemConfig);
}
