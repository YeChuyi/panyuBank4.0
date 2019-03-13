package com.bank.bean;

public class PageDescription {
    private Integer id;

    private String pageaddress;

    private String pagedate;

    private String pagemessage;

    private String pagewaring;

    private String pagephonenum;
    
    public PageDescription(){
    	
    }
    public PageDescription(Integer id, String pageaddress, String pagedate, String pagemessage, String pagewaring,
			String pagephonenum) {
		super();
		this.id = id;
		this.pageaddress = pageaddress;
		this.pagedate = pagedate;
		this.pagemessage = pagemessage;
		this.pagewaring = pagewaring;
		this.pagephonenum = pagephonenum;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPageaddress() {
        return pageaddress;
    }

    public void setPageaddress(String pageaddress) {
        this.pageaddress = pageaddress == null ? null : pageaddress.trim();
    }

    public String getPagedate() {
        return pagedate;
    }

    public void setPagedate(String pagedate) {
        this.pagedate = pagedate == null ? null : pagedate.trim();
    }

    public String getPagemessage() {
        return pagemessage;
    }

    public void setPagemessage(String pagemessage) {
        this.pagemessage = pagemessage == null ? null : pagemessage.trim();
    }

    public String getPagewaring() {
        return pagewaring;
    }

    public void setPagewaring(String pagewaring) {
        this.pagewaring = pagewaring == null ? null : pagewaring.trim();
    }

    public String getPagephonenum() {
        return pagephonenum;
    }

    public void setPagephonenum(String pagephonenum) {
        this.pagephonenum = pagephonenum == null ? null : pagephonenum.trim();
    }
}