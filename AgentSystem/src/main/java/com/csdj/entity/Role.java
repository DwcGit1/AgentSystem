package com.csdj.entity;

import java.util.Date;

public class Role extends Base {

<<<<<<< HEAD
	/*
	 * CREATE TABLE `as_role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '��ɫ����ID',
  `roleName` varchar(100) COLLATE utf8_unicode_ci NOT NULL COMMENT '��ɫ���',
  `creationTime` datetime NOT NULL COMMENT '����ʱ��',
  `createdBy` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '������',
  `lastUpdateTime` datetime DEFAULT '2013-01-01 00:00:01' COMMENT '����޸�ʱ��',
  `isStart` int(11) DEFAULT '1' COMMENT '�Ƿ�����1Ϊ����0Ϊ������',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
	 */
	
=======
	public Role(Integer id, String roleName, Date creationTime, String createdBy, Date lastUpdateTime, Integer isStart) {
		this.id = id;
		this.roleName = roleName;
		this.creationTime = creationTime;
		this.createdBy = createdBy;
		this.lastUpdateTime = lastUpdateTime;
		this.isStart = isStart;
	}

	/*
         * CREATE TABLE `as_role` (
      `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '��ɫ����ID',
      `roleName` varchar(100) COLLATE utf8_unicode_ci NOT NULL COMMENT '��ɫ���',
      `creationTime` datetime NOT NULL COMMENT '����ʱ��',
      `createdBy` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '������',
      `lastUpdateTime` datetime DEFAULT '2013-01-01 00:00:01' COMMENT '����޸�ʱ��',
      `isStart` int(11) DEFAULT '1' COMMENT '�Ƿ�����1Ϊ����0Ϊ������',
      PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
         */
	private Integer id;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

>>>>>>> 5f5f3bce419584250f9cd33a390f38d71be49773
	private String roleName;
	private Date creationTime;
	private String createdBy;
	private Date lastUpdateTime;
	private Integer isStart;
<<<<<<< HEAD
	
=======

	public Role() {
	}

>>>>>>> 5f5f3bce419584250f9cd33a390f38d71be49773
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Integer getIsStart() {
		return isStart;
	}
	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}
<<<<<<< HEAD
	
	
	
=======

	public Role(String roleName, Date creationTime, String createdBy, Date lastUpdateTime, Integer isStart) {
		this.roleName = roleName;
		this.creationTime = creationTime;
		this.createdBy = createdBy;
		this.lastUpdateTime = lastUpdateTime;
		this.isStart = isStart;
	}
>>>>>>> 5f5f3bce419584250f9cd33a390f38d71be49773
}
