package com.bank.bean;

public class ServiceOutlets {
    private Integer id;

    private String seroutaddress;

    private String seroutnum;

    private String seroutdate;

    private String seroutname;
     public ServiceOutlets(){
    	 
     }
    public ServiceOutlets(Integer id, String seroutaddress, String seroutnum, String seroutdate, String seroutname) {
		super();
		this.id = id;
		this.seroutaddress = seroutaddress;
		this.seroutnum = seroutnum;
		this.seroutdate = seroutdate;
		this.seroutname = seroutname;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeroutaddress() {
        return seroutaddress;
    }

    public void setSeroutaddress(String seroutaddress) {
        this.seroutaddress = seroutaddress == null ? null : seroutaddress.trim();
    }

    public String getSeroutnum() {
        return seroutnum;
    }

    public void setSeroutnum(String seroutnum) {
        this.seroutnum = seroutnum == null ? null : seroutnum.trim();
    }

    public String getSeroutdate() {
        return seroutdate;
    }

    public void setSeroutdate(String seroutdate) {
        this.seroutdate = seroutdate == null ? null : seroutdate.trim();
    }

    public String getSeroutname() {
        return seroutname;
    }

    public void setSeroutname(String seroutname) {
        this.seroutname = seroutname == null ? null : seroutname.trim();
    }
}