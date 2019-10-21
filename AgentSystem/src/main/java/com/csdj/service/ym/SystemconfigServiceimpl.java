package com.csdj.service.ym;

import com.csdj.dao.ym.SystemconfigMapper;
import com.csdj.entity.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("systemcongigservice")
public class SystemconfigServiceimpl implements SystemconfigService{
    @Autowired
    public SystemconfigMapper systemconfigMapper;

    @Override
    public List<SystemConfig> getsystemconfigs() {
        return systemconfigMapper.getsystemconfig();
    }

    @Override
    public int deleteconfigs(int id) {
        return systemconfigMapper.deleteconfig(id);
    }

    @Override
    public int addsystemconfigs(SystemConfig systemConfig) {
        return systemconfigMapper.addsystemconfig(systemConfig);
    }

    @Override
    public int updateconfigs(SystemConfig systemConfig) {
        return systemconfigMapper.updateconfig(systemConfig);
    }
}
