package com.csdj.service.ym;

import com.csdj.entity.Keywords;

import java.util.List;

public interface KeywordsService {
    List<Keywords> getKeywordsNice();
    List<Keywords> getlikeKeywordsNice(String keywords);
    int updateKeys(int id);
    int updatenotKeys(int id);
}
