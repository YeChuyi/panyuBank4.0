package com.bank.bean;

public class User {
    private Integer id;

    private String userpassword;

    private String userphonenum;
    public User(){
    	
    }
    public User(Integer id, String userpassword, String userphonenum) {
		super();
		this.id = id;
		this.userpassword = userpassword;
		this.userphonenum = userphonenum;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUserphonenum() {
        return userphonenum;
    }

    public void setUserphonenum(String userphonenum) {
        this.userphonenum = userphonenum == null ? null : userphonenum.trim();
    }
}