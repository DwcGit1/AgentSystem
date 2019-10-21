package com.csdj.dao.dwc.custom;

import com.csdj.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper {

    /**
     * 查询所有客户
     * @return
     */
    public List<Custom> getCustom();

    /**
     * 模糊查询
     * @param customName
     * @return
     */
    public List<Custom> getCustomByCustomName(@Param("customName") String customName);

    /**
     * 获取所有联系人
     * @return
     */
    public List<Contact> getContact();

    /**
     * 查询所有省
     * @return
     */
    public List<Province> getProvince();

    /**
     * 查询所有城市
     * @return
     */
    public List<City> getCity();

    /**
     * 查询所有区
     * @return
     */
    public List<Area> getArea();

    /**
     * 修改
     * @param custom
     * @return
     */
    public int updCustom(Custom custom);

    /**
     * 启用和停用
     * @param custom
     * @return
     */
    public int updCustomStatus(Custom custom);

    /**
     * 添加
     * @param custom
     * @return
     */
    public int addCustom(Custom custom);
}
