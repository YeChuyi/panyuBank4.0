package com.bank.bean;



public class PeLoOrder {
    private Integer id;

    private String peloorbusinesstype;
    

    private String peloordate;

    private String peloortime;

    private String peloorname;

    private String peloordocumenttype;

    private String peloordocumentnum;

    private String peloorphonenum;

    private String peloorbookingoutlets;

    private String peloorcreaterdate;

    private String userid;
    public PeLoOrder(){
    	
    }
    public PeLoOrder(Integer id, String peloorbusinesstype, String peloordate, String peloortime, String peloorname,
			String peloordocumenttype, String peloordocumentnum, String peloorphonenum, String peloorbookingoutlets,
			String peloorcreaterdate, String userid) {
		super();
		this.id = id;
		this.peloorbusinesstype = peloorbusinesstype;
		this.peloordate = peloordate;
		this.peloortime = peloortime;
		this.peloorname = peloorname;
		this.peloordocumenttype = peloordocumenttype;
		this.peloordocumentnum = peloordocumentnum;
		this.peloorphonenum = peloorphonenum;
		this.peloorbookingoutlets = peloorbookingoutlets;
		this.peloorcreaterdate = peloorcreaterdate;
		this.userid = userid;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeloorbusinesstype() {
        return peloorbusinesstype;
    }

    public void setPeloorbusinesstype(String peloorbusinesstype) {
        this.peloorbusinesstype = peloorbusinesstype == null ? null : peloorbusinesstype.trim();
    }

    public String getPeloordate() {
        return peloordate;
    }

    public void setPeloordate(String peloordate) {
        this.peloordate = peloordate;
    }

    public String getPeloortime() {
        return peloortime;
    }

    public void setPeloortime(String peloortime) {
        this.peloortime = peloortime == null ? null : peloortime.trim();
    }

    public String getPeloorname() {
        return peloorname;
    }

    public void setPeloorname(String peloorname) {
        this.peloorname = peloorname == null ? null : peloorname.trim();
    }

    public String getPeloordocumenttype() {
        return peloordocumenttype;
    }

    public void setPeloordocumenttype(String peloordocumenttype) {
        this.peloordocumenttype = peloordocumenttype == null ? null : peloordocumenttype.trim();
    }

    public String getPeloordocumentnum() {
        return peloordocumentnum;
    }

    public void setPeloordocumentnum(String peloordocumentnum) {
        this.peloordocumentnum = peloordocumentnum == null ? null : peloordocumentnum.trim();
    }

    public String getPeloorphonenum() {
        return peloorphonenum;
    }

    public void setPeloorphonenum(String peloorphonenum) {
        this.peloorphonenum = peloorphonenum == null ? null : peloorphonenum.trim();
    }

    public String getPeloorbookingoutlets() {
        return peloorbookingoutlets;
    }

    public void setPeloorbookingoutlets(String peloorbookingoutlets) {
        this.peloorbookingoutlets = peloorbookingoutlets == null ? null : peloorbookingoutlets.trim();
    }

    public String getPeloorcreaterdate() {
        return peloorcreaterdate;
    }

    public void setPeloorcreaterdate(String peloorcreaterdate) {
        this.peloorcreaterdate = peloorcreaterdate == null ? null : peloorcreaterdate.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
	@Override
	public String toString() {
		return "PeLoOrder [id=" + id + ", peloorbusinesstype=" + peloorbusinesstype + ", peloordate=" + peloordate
				+ ", peloortime=" + peloortime + ", peloorname=" + peloorname + ", peloordocumenttype="
				+ peloordocumenttype + ", peloordocumentnum=" + peloordocumentnum + ", peloorphonenum=" + peloorphonenum
				+ ", peloorbookingoutlets=" + peloorbookingoutlets + ", peloorcreaterdate=" + peloorcreaterdate
				+ ", userid=" + userid + "]";
	}
    
}