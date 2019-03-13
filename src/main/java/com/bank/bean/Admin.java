package com.bank.bean;

public class Admin {
    private Integer id;

    private String adminuser;

    private String adminpassword;

    private String adminposition;

    private String adminname;

    private String adminphonenum;

    private Integer status;
    public Admin(){
    	
    }
    public Admin(Integer id, String adminuser, String adminpassword, String adminposition, String adminname,
			String adminphonenum, Integer status) {
		super();
		this.id = id;
		this.adminuser = adminuser;
		this.adminpassword = adminpassword;
		this.adminposition = adminposition;
		this.adminname = adminname;
		this.adminphonenum = adminphonenum;
		this.status = status;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminuser() {
        return adminuser;
    }

    public void setAdminuser(String adminuser) {
        this.adminuser = adminuser == null ? null : adminuser.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public String getAdminposition() {
        return adminposition;
    }

    public void setAdminposition(String adminposition) {
        this.adminposition = adminposition == null ? null : adminposition.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminphonenum() {
        return adminphonenum;
    }

    public void setAdminphonenum(String adminphonenum) {
        this.adminphonenum = adminphonenum == null ? null : adminphonenum.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}