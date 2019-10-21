package com.csdj.dao.dwc.keywords;

import com.csdj.entity.Keywords;

import java.util.List;

public interface KeywordsMapper {

    public List<String> getcustomername();

    public int addKeywords(Keywords keywords);

    public Keywords getKeywordsByKeyword(Keywords keywords);
}
