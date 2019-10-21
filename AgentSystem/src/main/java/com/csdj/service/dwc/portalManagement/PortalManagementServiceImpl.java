package com.csdj.service.dwc.portalManagement;

import com.csdj.dao.dwc.portalManagement.PortalManagementMapper;
import com.csdj.entity.Contact;
import com.csdj.entity.Custom;
import com.csdj.entity.Keywords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("portalManagementService")
@Controller
public class PortalManagementServiceImpl implements PortalManagementService{

    @Autowired
    private PortalManagementMapper portalManagementMapper;


    @Override
    public List<Keywords> getAllKeywordsList(Integer page, Integer limit) {
        return portalManagementMapper.getKeywordsList(page,limit);
    }

    @Override
    public int show_keywords_Count() {
        return portalManagementMapper.getSelect_Keywords_Count();
    }

    @Override
    public List<Keywords> getListByName(Integer page, Integer limit, String keywords, String customeName) {
        return portalManagementMapper.getListByName(page,limit,keywords,customeName);
    }

    @Override
    public Keywords getKeywordInfoById(Integer id) {
        return portalManagementMapper.getKeywordInfo(id);
    }

    @Override
    public Custom getCustom(Integer id) {
        return portalManagementMapper.getCustom(id);
    }

    @Override
    public List<Contact> getContactes(Integer customId) {
        return portalManagementMapper.getContactes(customId);
    }

    @Override
    public String getProvinces(String provinces) {
        return portalManagementMapper.getProvinces(provinces);
    }

    @Override
    public String getAreas(String area) {
        return portalManagementMapper.getAreas(area);
    }

    @Override
    public String getCities(String city) {
        return portalManagementMapper.getCities(city);
    }

    @Override
    public boolean updKeywordsInfo(Keywords keywords) {
        return portalManagementMapper.modifyKeywords(keywords);
    }
}
