package com.csdj.service.ym;

import com.csdj.dao.ym.AppurlMapper;
import com.csdj.entity.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("appurlservice")
public class AppurlServiceimpl implements AppurlService{
    @Autowired
    public AppurlMapper appurlMapper;

    public void setAppurlMapper(AppurlMapper appurlMapper) {
        this.appurlMapper = appurlMapper;
    }

    @Override
    public List<SystemConfig> getAppConfigs() {
        return appurlMapper.getAppConfig();
    }

    @Override
    public int updateAppConfigs(SystemConfig systemConfig) {
        return appurlMapper.updateAppConfig(systemConfig);
    }
}
