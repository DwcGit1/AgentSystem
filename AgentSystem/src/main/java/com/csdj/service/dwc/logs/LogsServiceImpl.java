package com.csdj.service.dwc.logs;

import com.csdj.dao.dwc.logs.LogsMapper;
import com.csdj.entity.Logs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("logsService")
public class LogsServiceImpl implements LogsService{

    @Autowired
    private LogsMapper logsMapper;

    @Override
    public List<Logs> getLogs(int page,int limit) {
        return logsMapper.getLogs((page-1)*limit,limit);
    }

    @Override
    public int getLogsCount() {
        return logsMapper.getLogsCount();
    }
}
