package com.csdj.service.dwc.accountdetail;

import com.csdj.entity.AccountDetail;

import java.util.List;

public interface AccountDetailService {

    public List<AccountDetail> getAccountDetail(int page,int limit);

    public int getAccountDetailCount();
}
