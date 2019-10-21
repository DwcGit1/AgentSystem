package com.csdj.dao.dwc.serve;

import com.csdj.entity.SystemConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServeMapper {

    public List<SystemConfig> showkehu();

    public List<SystemConfig> selectid(@Param("id") int id);

    public boolean kehuupdate(SystemConfig systemConfig);

    public boolean kehuadd(SystemConfig systemConfig);

    public boolean kehudel(@Param("id") int id);

    public List<SystemConfig> sfzshow();

    public List<SystemConfig> sfzid(@Param("id") int id);

    public boolean sfzdel(@Param("id") int id);

    public boolean sfzupdate(SystemConfig systemConfig);

    public boolean sfzadd(SystemConfig systemConfig);

    public List<SystemConfig> youhuishow();

    public List<SystemConfig> youhuiid(@Param("id") int id);

    public boolean youhuidel(@Param("id") int id);

    public boolean youhuiupdate(SystemConfig systemConfig);

    public boolean youhuiadd(SystemConfig systemConfig);
}
