package com.csdj.dao.dwc.checkByDateAccountDetails;

import com.csdj.entity.AccountDetail;

import java.util.List;

public interface CheckByDateAccountDetailsMapper {

    public List<AccountDetail> getAccountDetailList(AccountDetail accountDetail);
}
