package com.bank.bean;

public class MessageBoard {
    private Integer id;

    private String messusername;

    private String messuserphonenum;

    private String messusermessage;

    private String adminmessage;

    private Integer status;

    private String openid;

    private String messdate;
    public MessageBoard(){
    	
    }
    public MessageBoard(Integer id, String messusername, String messuserphonenum, String messusermessage,
			String adminmessage, Integer status, String openid, String messdate) {
		super();
		this.id = id;
		this.messusername = messusername;
		this.messuserphonenum = messuserphonenum;
		this.messusermessage = messusermessage;
		this.adminmessage = adminmessage;
		this.status = status;
		this.openid = openid;
		this.messdate = messdate;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessusername() {
        return messusername;
    }

    public void setMessusername(String messusername) {
        this.messusername = messusername == null ? null : messusername.trim();
    }

    public String getMessuserphonenum() {
        return messuserphonenum;
    }

    public void setMessuserphonenum(String messuserphonenum) {
        this.messuserphonenum = messuserphonenum == null ? null : messuserphonenum.trim();
    }

    public String getMessusermessage() {
        return messusermessage;
    }

    public void setMessusermessage(String messusermessage) {
        this.messusermessage = messusermessage == null ? null : messusermessage.trim();
    }

    public String getAdminmessage() {
        return adminmessage;
    }

    public void setAdminmessage(String adminmessage) {
        this.adminmessage = adminmessage == null ? null : adminmessage.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getMessdate() {
        return messdate;
    }

    public void setMessdate(String messdate) {
        this.messdate = messdate == null ? null : messdate.trim();
    }
	@Override
	public String toString() {
		return "MessageBoard [id=" + id + ", messusername=" + messusername + ", messuserphonenum=" + messuserphonenum
				+ ", messusermessage=" + messusermessage + ", adminmessage=" + adminmessage + ", status=" + status
				+ ", openid=" + openid + ", messdate=" + messdate + "]";
	}
    
}