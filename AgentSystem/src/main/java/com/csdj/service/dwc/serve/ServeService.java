package com.csdj.service.dwc.serve;

import com.csdj.entity.SystemConfig;

import java.util.List;

public interface ServeService {

    public List<SystemConfig> showkehu();

    public List<SystemConfig> selectid(int id);

    public boolean kehuupdate(SystemConfig SystemConfig);

    public boolean kehuadd(SystemConfig systemConfig);

    public boolean kehudel(int id);

    public List<SystemConfig> sfzshow();

    List<SystemConfig> sfzid(int id);

    public boolean sfzdel(int id);

    public boolean sfzupdate(SystemConfig systemConfig);

    boolean sfzadd(SystemConfig systemConfig);

    public List<SystemConfig> youhuishow();

    public List<SystemConfig> youhuiid(int id);

    public boolean youhuidel(int id);

    public boolean youhuiupdate(SystemConfig systemConfig);

    public boolean youhuiadd(SystemConfig systemConfig);
}
