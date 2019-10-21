package com.csdj.service.ym;

import com.csdj.entity.SystemConfig;

import java.util.List;

public interface Serviceconfig {
    List<SystemConfig> getAllconfigs();
    int deleteSystemConfigs(int id);
    int updateConfigs(SystemConfig systemConfig);
    int addConfigs(SystemConfig systemConfig);
}
