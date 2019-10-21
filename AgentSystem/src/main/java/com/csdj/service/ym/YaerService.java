package com.csdj.service.ym;

import com.csdj.entity.SystemConfig;

import java.util.List;

public interface YaerService {
    List<SystemConfig> getYearConfigs();
    int updateYears(SystemConfig systemConfig);
}
