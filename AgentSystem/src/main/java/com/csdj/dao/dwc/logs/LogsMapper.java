package com.csdj.dao.dwc.logs;

import com.csdj.entity.Logs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogsMapper {

    public List<Logs> getLogs(@Param("page") int page,@Param("limit") int limit);

    public int getLogsCount();
}
