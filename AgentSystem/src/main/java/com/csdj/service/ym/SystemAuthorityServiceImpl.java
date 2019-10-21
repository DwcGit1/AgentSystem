package com.csdj.service.ym;

import com.csdj.dao.ym.SystemAuthorityMapper;
import com.csdj.entity.Function;
import com.csdj.entity.Premission;
import com.csdj.entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SystemAuthorityServiceImpl implements SystemAuthorityService{

    @Resource
    private SystemAuthorityMapper authorityMapper;

    /**
     * 所有角色供选择
     * @return
     */
    public List<Role> GetRoleName() {
        return authorityMapper.GetRoleName();
    }

    public List<Integer> show_FunctionId(int roleId) {
        return authorityMapper.getSelect_FunctionId(roleId);
    }


    public List<Function> show_All_Function() {
        return authorityMapper.getSelect_All_Function();
    }

    public Integer show_Id(Integer roleId, Integer functionId) {
        return authorityMapper.getSelect_Id(roleId,functionId);
    }

    public boolean del_Premission(Integer id) {
        return authorityMapper.getDelete_Premission(id);
    }

    public boolean add_Premission(Premission premission) {
        return authorityMapper.getInsert_Premission(premission);
    }

}
