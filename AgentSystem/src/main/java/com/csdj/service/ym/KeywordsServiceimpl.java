package com.csdj.service.ym;

import com.csdj.dao.ym.KeywordsMapper;
import com.csdj.dao.ym.RoleMapper;
import com.csdj.entity.Keywords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("keywordsservice")
public class KeywordsServiceimpl implements KeywordsService{

    @Autowired
    public KeywordsMapper keywordsMapper;

    @Override
    public List<Keywords> getKeywordsNice() {
        return keywordsMapper.getKeywords();
    }

    @Override
    public List<Keywords> getlikeKeywordsNice(String keywords) {
        return keywordsMapper.getlikeKeywords(keywords);
    }

    @Override
    public int updateKeys(int id) {
        return keywordsMapper.updateKey(id);
    }

    @Override
    public int updatenotKeys(int id) {
        return keywordsMapper.updatenotKey(id);
    }
}
