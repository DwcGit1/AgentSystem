package com.csdj.service.dwc.portalManagement;

import com.csdj.entity.Contact;
import com.csdj.entity.Custom;
import com.csdj.entity.Keywords;

import java.util.List;

public interface PortalManagementService {

    public List<Keywords> getAllKeywordsList(Integer page, Integer limit);

    public int show_keywords_Count();

    public List<Keywords> getListByName(Integer page,Integer limit,String keywords,String customName);

    public Keywords getKeywordInfoById(Integer id);

    public Custom getCustom(Integer id);

    public List<Contact> getContactes(Integer customId);
    public String getProvinces(String provinces);
    public String getAreas(String area);
    public String getCities(String city);

    public boolean updKeywordsInfo(Keywords keywords);
}
