package com.csdj.service.dwc.logs;

import com.csdj.entity.Logs;

import java.util.List;

public interface LogsService {

    public List<Logs> getLogs(int page,int limit);

    public int getLogsCount();
}
