package com.csdj.entity;

import java.util.Date;

public class Function extends Base {

	/*
	 * 
	 * CREATE TABLE `as_function` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `functionCode` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `functionName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `creationTime` datetime NOT NULL,
  `createdBy` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `lastUpdateTime` datetime DEFAULT '2013-01-01 00:00:01',
  `isStart` int(11) DEFAULT '1' COMMENT '1Ϊ����0Ϊ������',
  PRIMARY KEY (`functionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
	 */
	private String functionCode;
	private String functionName;
	private Date creationTime;
	private String createdBy;
	private Date lastUpdateTime;
	private Integer isStart;
	private String funcUrl;
	private boolean isCheck = false;
	private Integer parentId;
<<<<<<< HEAD
	
	
	
=======

	public Function() {
	}

	public Function(String functionCode, String functionName, Date creationTime, String createdBy, Date lastUpdateTime, Integer isStart, String funcUrl, boolean isCheck, Integer parentId) {
		this.functionCode = functionCode;
		this.functionName = functionName;
		this.creationTime = creationTime;
		this.createdBy = createdBy;
		this.lastUpdateTime = lastUpdateTime;
		this.isStart = isStart;
		this.funcUrl = funcUrl;
		this.isCheck = isCheck;
		this.parentId = parentId;
	}

>>>>>>> 5f5f3bce419584250f9cd33a390f38d71be49773
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}
	public boolean getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}
	public String getFuncUrl() {
		return funcUrl;
	}
	public void setFuncUrl(String funcUrl) {
		this.funcUrl = funcUrl;
	}
	public String getFunctionCode() {
		return functionCode;
	}
	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
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
	
	
}
