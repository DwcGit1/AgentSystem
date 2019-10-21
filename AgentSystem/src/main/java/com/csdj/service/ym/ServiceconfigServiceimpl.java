package com.csdj.service.ym;

import com.csdj.dao.ym.ServiceMapper;
import com.csdj.entity.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service("serviceconfigserviceimpl")
public class ServiceconfigServiceimpl implements Serviceconfig{
    @Autowired
    public ServiceMapper serviceMapper;
    @Override
    public List<SystemConfig> getAllconfigs() {
        return serviceMapper.getAllconfig();
    }

        @Override
        public int deleteSystemConfigs(int id) {
            return serviceMapper.deleteSystemConfig(id);
        }

        @Override
        public int updateConfigs(SystemConfig systemConfig) {
            return serviceMapper.updateConfig(systemConfig);
        }

        @Override
        public int addConfigs(SystemConfig systemConfig) {
            return serviceMapper.addConfig(systemConfig);
        }
    }
