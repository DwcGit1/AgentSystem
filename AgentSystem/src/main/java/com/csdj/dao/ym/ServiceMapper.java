package com.csdj.dao.ym;

import com.csdj.entity.SystemConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServiceMapper {
        /*显示所有服务信息*/
        List<SystemConfig> getAllconfig();
        /*删除服务信息*/
        int deleteSystemConfig(@Param("id") int id);
        /*修改服务信息*/
        int updateConfig(SystemConfig systemConfig);
        /*新增服务信息*/
        int addConfig(SystemConfig systemConfig);
}
