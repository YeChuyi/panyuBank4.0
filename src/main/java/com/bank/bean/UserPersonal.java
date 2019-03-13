package com.bank.bean;

import java.util.Date;

public class UserPersonal {
    private Integer id;

    private String openid;

    private String username;

    private String sex;

    private String city;

    private String phone;

    private String firstTime;

    private Date nearTime;

    private Integer times;
    public UserPersonal() {
		// TODO Auto-generated constructor stub
	}
    
    public UserPersonal(Integer id, String openid, String username, String sex, String city, String phone,
			String firstTime, Date nearTime, Integer times) {
		super();
		this.id = id;
		this.openid = openid;
		this.username = username;
		this.sex = sex;
		this.city = city;
		this.phone = phone;
		this.firstTime = firstTime;
		this.nearTime = nearTime;
		this.times = times;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    public Date getNearTime() {
        return nearTime;
    }

    public void setNearTime(Date nearTime) {
        this.nearTime = nearTime;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }
}