package com.csdj.dao.dwc.login;

import com.csdj.entity.User;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {

    public User userLogin(@Param("userCode") String userCode, @Param("userPassword") String userPassword);
}
