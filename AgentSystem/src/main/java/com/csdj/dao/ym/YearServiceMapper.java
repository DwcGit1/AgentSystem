package com.csdj.dao.ym;

import com.csdj.entity.SystemConfig;
import com.csdj.service.ym.Serviceconfig;

import java.util.List;

public interface YearServiceMapper {
    /*显示服务年限信息*/
    List<SystemConfig> getYearConfig();
   /* 修改服务年限信息*/
    int updateYear(SystemConfig systemConfig);
}
