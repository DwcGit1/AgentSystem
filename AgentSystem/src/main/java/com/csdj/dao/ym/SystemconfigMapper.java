package com.csdj.dao.ym;

import com.csdj.entity.SystemConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemconfigMapper {
    /*查询所有财务信息*/
    List<SystemConfig> getsystemconfig();
    /*删除财务信息*/
    int deleteconfig(@Param("id") int id);
    /*新增财务信息*/
    int addsystemconfig(SystemConfig systemConfig);
    /*修改财务信息*/
    int updateconfig(SystemConfig systemConfig);
}
