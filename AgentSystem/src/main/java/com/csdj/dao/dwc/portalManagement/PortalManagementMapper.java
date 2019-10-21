package com.csdj.dao.dwc.portalManagement;

import com.csdj.entity.Contact;
import com.csdj.entity.Custom;
import com.csdj.entity.Keywords;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PortalManagementMapper {

    public int getSelect_Keywords_Count();

    @Select("select * from as_keywords limit #{page},#{limit}")
    public List<Keywords> getKeywordsList(@Param("page") Integer page, @Param("limit") Integer limit);

    public List<Keywords> getListByName(@Param("page") Integer page,@Param("limit") Integer limit,@Param("keywords") String keywords,@Param("customName") String customName);

    @Select("select * from as_keywords where id =#{id}")
    public Keywords getKeywordInfo(@Param("id") Integer id);

    @Select("SELECT c.* from as_customs as c,as_keywords as k where c.agentId = k.agentId and k.id=#{id}")
    public Custom getCustom(@Param("id") Integer id);

    @Select("select c.* from as_contacts as c where c.customId = #{customId}")
    public List<Contact> getContactes(@Param("customId") Integer customId);

    @Select("select p.province from hat_province as p where p.provinceID  = #{province}")
    public String getProvinces(@Param("province") String province);

    @Select("select a.area from hat_area as a where a.areaID  = #{area}")
    public String getAreas(@Param("area") String area);

    @Select("select c.city  from hat_city as c where c.cityID  = #{city}")
    public String getCities(@Param("city") String city);

    public boolean modifyKeywords(Keywords keywords);
}
