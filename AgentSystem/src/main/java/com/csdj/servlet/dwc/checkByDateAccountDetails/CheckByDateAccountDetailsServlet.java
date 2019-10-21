package com.csdj.servlet.dwc.checkByDateAccountDetails;

import com.csdj.entity.AccountDetail;
import com.csdj.service.dwc.checkByDateAccountDetails.CheckByDateAccountDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@RequestMapping("/sys")
@Controller
public class CheckByDateAccountDetailsServlet {

    @Autowired
    private CheckByDateAccountDetailsService checkByDateAccountDetailsService;

    @RequestMapping("getAccountDetailList.json")
    @ResponseBody
    public List<AccountDetail> getAccountDetailList(@RequestParam(value = "begin",required = false) Object begin, @RequestParam(value = "finish",required = false) Object finish){
        boolean account;
        try {
            account =begin.equals(null) || null==begin;
        }catch (Exception e){
            account=true;
        }
        List<AccountDetail> list= null;
        AccountDetail accountDetail=new AccountDetail();
        try {
            if (!account){
                DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println("-------------------------------------得到数据"+begin+""+finish);
                accountDetail.setStartTime(format1.parse(begin.toString()));
                accountDetail.setEndTime(format1.parse(finish.toString()));
            }
            System.out.println("查询方法进入I");
            list = checkByDateAccountDetailsService.getAccountDetail(accountDetail);
        } catch (Exception e) {
            System.out.println("--------------------------------------------得到数据出现异常");
            e.printStackTrace();
        }
        return  list;
    }
}
