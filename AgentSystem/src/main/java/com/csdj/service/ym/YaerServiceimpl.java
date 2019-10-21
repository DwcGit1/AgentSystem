package com.csdj.service.ym;

import com.csdj.dao.ym.YearServiceMapper;
import com.csdj.entity.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("yaerservice")
public class YaerServiceimpl implements YaerService{
    @Autowired
    public YearServiceMapper yearServiceMapper;
/*    public void setYearServiceMapper(YearServiceMapper yearServiceMapper) {
        this.yearServiceMapper = yearServiceMapper;
    }*/

    @Override
    public List<SystemConfig> getYearConfigs() {
        return yearServiceMapper.getYearConfig();
    }

    @Override
    public int updateYears(SystemConfig systemConfig) {
        return yearServiceMapper.updateYear(systemConfig);
    }


}
