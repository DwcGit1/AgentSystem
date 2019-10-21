package com.csdj.service.ym;

import com.csdj.entity.SystemConfig;

import java.util.List;

public interface SystemconfigService {
    List<SystemConfig> getsystemconfigs();
    int deleteconfigs(int id);
    int addsystemconfigs(SystemConfig systemConfig);
    int updateconfigs(SystemConfig systemConfig);

}
