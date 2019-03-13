package com.bank.bean;

import java.util.Date;

public class IP {
    private Integer id;

    private String user;

    private String ip;

    private String nation;

    private String province;

    private String city;

    private String district;

    private Date dateTime;

    private Integer times;

    private String status;
    public IP(){
    	
    }
    public IP(Integer id, String user, String ip, String nation, String province, String city, String district,
			Date dateTime, Integer times, String status) {
		super();
		this.id = id;
		this.user = user;
		this.ip = ip;
		this.nation = nation;
		this.province = province;
		this.city = city;
		this.district = district;
		this.dateTime = dateTime;
		this.times = times;
		this.status = status;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}