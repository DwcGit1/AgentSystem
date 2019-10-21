package com.csdj.dao.ym;

import com.csdj.entity.Keywords;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KeywordsMapper {
   /* 查询所有关键字审核信息*/
    List<Keywords> getKeywords();
    /*按关键词查询审核信息*/
    List<Keywords> getlikeKeywords(@Param("keywords") String keywords);
    /*修改客户使用状态*/
    int updateKey(@Param("id") int id);
   /*修改客户不使用状态*/
   int updatenotKey(@Param("id") int id);
}
