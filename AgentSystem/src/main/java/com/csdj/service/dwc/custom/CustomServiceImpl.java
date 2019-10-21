package com.csdj.service.dwc.custom;

import com.csdj.dao.dwc.custom.CustomMapper;
import com.csdj.entity.*;
import com.csdj.service.dwc.custom.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Controller
@Service("customService")
public class CustomServiceImpl implements CustomService{

    @Autowired
    private CustomMapper customMapper;

    @Override
    public List<Custom> getCustom() {
        return customMapper.getCustom();
    }

    @Override
    public List<Custom> getCustomByCustomName(String customName) {
        return customMapper.getCustomByCustomName(customName);
    }

    @Override
    public List<Contact> getContact() {
        return customMapper.getContact();
    }

    @Override
    public List<Province> getProvince() {
        return customMapper.getProvince();
    }

    @Override
    public List<City> getCity() {
        return customMapper.getCity();
    }

    @Override
    public List<Area> getArea() {
        return customMapper.getArea();
    }

    @Override
    public int updCustom(Custom custom) {
        return customMapper.updCustom(custom);
    }

    @Override
    public int updCustomStatus(Custom custom) {
        return customMapper.updCustomStatus(custom);
    }

    @Override
    public int addCustom(Custom custom) {
        return customMapper.addCustom(custom);
    }

}
