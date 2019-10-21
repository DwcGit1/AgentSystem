package com.csdj.service.dwc.custom;

import com.csdj.entity.*;

import java.util.List;

public interface CustomService {

    public List<Custom> getCustom();

    public List<Custom> getCustomByCustomName(String customName);

    public List<Contact> getContact();

    public List<Province> getProvince();

    public List<City> getCity();

    public List<Area> getArea();

    public int updCustom(Custom custom);

    public int updCustomStatus(Custom custom);

    public int addCustom(Custom custom);
}
