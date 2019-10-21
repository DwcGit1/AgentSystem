package com.csdj.service.dwc.checkByDateAccountDetails;

import com.csdj.dao.dwc.checkByDateAccountDetails.CheckByDateAccountDetailsMapper;
import com.csdj.entity.AccountDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Controller
@Service("checkByDateAccountDetailsService")
public class CheckByDateAccountDetailsServiceImpl implements CheckByDateAccountDetailsService{

    @Autowired
    private CheckByDateAccountDetailsMapper checkByDateAccountDetailsMapper;

    @Override
    public List<AccountDetail> getAccountDetail(AccountDetail accountDetail) {
        return checkByDateAccountDetailsMapper.getAccountDetailList(accountDetail);
    }
}
