package com.csdj.service.dwc.keywords;

import com.csdj.entity.Keywords;

import java.util.List;

public interface KeywordsService {

    public List<String> getcustomername();

    public int addKeywords(Keywords keywords);

    public Keywords getKeywordsByKeyword(Keywords keywords);
}
