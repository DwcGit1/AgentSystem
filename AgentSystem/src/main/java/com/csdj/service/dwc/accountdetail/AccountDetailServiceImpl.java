package com.csdj.service.dwc.accountdetail;

import com.csdj.dao.dwc.accountdetail.AccountDetailMapper;
import com.csdj.entity.AccountDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Controller
@Service("accountDetailService")
public class AccountDetailServiceImpl implements AccountDetailService{

    @Autowired
    private AccountDetailMapper accountDetailMapper;

    @Override
    public List<AccountDetail> getAccountDetail(int page, int limit) {
        return accountDetailMapper.getAccountDetail((page-1)*limit,limit);
    }

    @Override
    public int getAccountDetailCount() {
        return accountDetailMapper.getAccountDetailCount();
    }
}
