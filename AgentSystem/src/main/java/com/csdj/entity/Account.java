package com.csdj.entity;

import java.math.BigDecimal;

public class Account extends Base {

<<<<<<< HEAD
	/*
	 * CREATE TABLE `as_account` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) unsigned NOT NULL,
  `money` decimal(10,0) NOT NULL DEFAULT '0',
  `moneyBak` decimal(10,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

	 */
=======
    public Account(Integer userId, BigDecimal money, BigDecimal moneyBak, String userName) {
        this.userId = userId;
        this.money = money;
        this.moneyBak = moneyBak;
        this.userName = userName;
    }

    /*
         * CREATE TABLE `as_account` (
      `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
      `userId` bigint(20) unsigned NOT NULL,
      `money` decimal(10,0) NOT NULL DEFAULT '0',
      `moneyBak` decimal(10,0) NOT NULL DEFAULT '0',
      PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

         */
>>>>>>> 5f5f3bce419584250f9cd33a390f38d71be49773
	private Integer userId;
	private BigDecimal money;
	private BigDecimal moneyBak;
	private String userName;
<<<<<<< HEAD
	
=======

	public Account() {
	}

>>>>>>> 5f5f3bce419584250f9cd33a390f38d71be49773
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public BigDecimal getMoneyBak() {
		return moneyBak;
	}
	public void setMoneyBak(BigDecimal moneyBak) {
		this.moneyBak = moneyBak;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 5f5f3bce419584250f9cd33a390f38d71be49773
}
