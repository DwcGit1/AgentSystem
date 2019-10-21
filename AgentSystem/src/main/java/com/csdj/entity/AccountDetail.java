package com.csdj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountDetail extends Base {

	/*
	 * CREATE TABLE `as_accountdetail` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) unsigned NOT NULL,
  `detailType` bigint(20) unsigned NOT NULL,
  `detailTypeName` varchar(50) NOT NULL,
  `money` decimal(10,0) NOT NULL DEFAULT '0',
  `accountMoney` decimal(10,0) NOT NULL DEFAULT '0',
  `memo` char(255) DEFAULT NULL,
  `detailDateTime` datetime NOT NULL DEFAULT '2012-01-01 00:01:01',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	 */
<<<<<<< HEAD
	private Integer userId;
	private Integer detailType;
	private String  detailTypeName;
	private BigDecimal money;
	private BigDecimal accountMoney;
=======
	private Integer id;


	public AccountDetail(Integer userId, Integer detailType, String detailTypeName, Integer money, Integer accountMoney, String memo, Date detailDateTime) {
		this.userId = userId;
		this.detailType = detailType;
		this.detailTypeName = detailTypeName;
		this.money = money;
		this.accountMoney = accountMoney;
		this.memo = memo;
		this.detailDateTime = detailDateTime;

	}


	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	private Integer userId;
	private Integer detailType;
	private String  detailTypeName;
	private Integer money;
	private Integer accountMoney;
>>>>>>> 5f5f3bce419584250f9cd33a390f38d71be49773
	private String memo;
	private Date detailDateTime;
	private String userName;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getDetailType() {
		return detailType;
	}
	public void setDetailType(Integer detailType) {
		this.detailType = detailType;
	}
	
	public String getDetailTypeName() {
		return detailTypeName;
	}
	public void setDetailTypeName(String detailTypeName) {
		this.detailTypeName = detailTypeName;
	}
<<<<<<< HEAD
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public BigDecimal getAccountMoney() {
		return accountMoney;
	}
	public void setAccountMoney(BigDecimal accountMoney) {
=======
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Integer getAccountMoney() {
		return accountMoney;
	}
	public void setAccountMoney(Integer accountMoney) {
>>>>>>> 5f5f3bce419584250f9cd33a390f38d71be49773
		this.accountMoney = accountMoney;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getDetailDateTime() {
		return detailDateTime;
	}
	public void setDetailDateTime(Date detailDateTime) {
		this.detailDateTime = detailDateTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
