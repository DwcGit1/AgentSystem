package com.csdj.service.dwc.serve;

import com.csdj.dao.dwc.serve.ServeMapper;
import com.csdj.entity.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serveService")
@Controller
public class ServeServiceImpl implements ServeService{

    @Autowired
    private ServeMapper serveMapper;


    @Override
    public List<SystemConfig> showkehu() {
        return serveMapper.showkehu();
    }

    @Override
    public List<SystemConfig> selectid(int id) {
        return serveMapper.selectid(id);
    }

    @Override
    public boolean kehuupdate(SystemConfig systemConfig) {
        return serveMapper.kehuupdate(systemConfig);
    }

    @Override
    public boolean kehuadd(SystemConfig systemConfig) {
        return serveMapper.kehuadd(systemConfig);
    }

    @Override
    public boolean kehudel(int id) {
        return serveMapper.kehudel(id);
    }

    @Override
    public List<SystemConfig> sfzshow() {
        return serveMapper.sfzshow();
    }

    @Override
    public List<SystemConfig> sfzid(int id) {
        return serveMapper.sfzid(id);
    }

    @Override
    public boolean sfzdel(int id) {
        return serveMapper.sfzdel(id);
    }

    @Override
    public boolean sfzupdate(SystemConfig systemConfig) {
        return serveMapper.sfzupdate(systemConfig);
    }

    @Override
    public boolean sfzadd(SystemConfig systemConfig) {
        return serveMapper.sfzadd(systemConfig);
    }

    @Override
    public List<SystemConfig> youhuishow() {
        return serveMapper.youhuishow();
    }

    @Override
    public List<SystemConfig> youhuiid(int id) {
        return serveMapper.youhuiid(id);
    }

    @Override
    public boolean youhuidel(int id) {
        return serveMapper.youhuidel(id);
    }

    @Override
    public boolean youhuiupdate(SystemConfig systemConfig) {
        return serveMapper.youhuiupdate(systemConfig);
    }

    @Override
    public boolean youhuiadd(SystemConfig systemConfig) {
        return serveMapper.youhuiadd(systemConfig);
    }

}
