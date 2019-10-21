package com.csdj.service.dwc.keywords;

import com.csdj.dao.dwc.keywords.KeywordsMapper;
import com.csdj.entity.Keywords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Controller
@Service("keywordsService")
public class KeywordsServiceImpl implements KeywordsService{

    @Autowired
    private KeywordsMapper keywordsMapper;

    @Override
    public List<String> getcustomername() {
        return keywordsMapper.getcustomername();
    }

    @Override
    public int addKeywords(Keywords keywords) {
        return keywordsMapper.addKeywords(keywords);
    }

    @Override
    public Keywords getKeywordsByKeyword(Keywords keywords){
        return keywordsMapper.getKeywordsByKeyword(keywords);
    }
}
