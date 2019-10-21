package com.csdj.dao.dwc.accountdetail;

import com.csdj.entity.AccountDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountDetailMapper {

    public int getAccountDetailCount();

    public List<AccountDetail> getAccountDetail(@Param("page") int page,@Param("limit") int limit);
}
