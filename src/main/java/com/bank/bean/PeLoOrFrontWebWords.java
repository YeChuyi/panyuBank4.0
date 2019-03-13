package com.bank.bean;

public class PeLoOrFrontWebWords {
    private Integer id;

    private String peloordealaddress;

    private String peloordealdate;

    private String peloordealmessage;

    private String peloordealphonenum;
    public PeLoOrFrontWebWords(){
    	
    }
    public PeLoOrFrontWebWords(Integer id, String peloordealaddress, String peloordealdate, String peloordealmessage,
			String peloordealphonenum) {
		super();
		this.id = id;
		this.peloordealaddress = peloordealaddress;
		this.peloordealdate = peloordealdate;
		this.peloordealmessage = peloordealmessage;
		this.peloordealphonenum = peloordealphonenum;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeloordealaddress() {
        return peloordealaddress;
    }

    public void setPeloordealaddress(String peloordealaddress) {
        this.peloordealaddress = peloordealaddress == null ? null : peloordealaddress.trim();
    }

    public String getPeloordealdate() {
        return peloordealdate;
    }

    public void setPeloordealdate(String peloordealdate) {
        this.peloordealdate = peloordealdate == null ? null : peloordealdate.trim();
    }

    public String getPeloordealmessage() {
        return peloordealmessage;
    }

    public void setPeloordealmessage(String peloordealmessage) {
        this.peloordealmessage = peloordealmessage == null ? null : peloordealmessage.trim();
    }

    public String getPeloordealphonenum() {
        return peloordealphonenum;
    }

    public void setPeloordealphonenum(String peloordealphonenum) {
        this.peloordealphonenum = peloordealphonenum == null ? null : peloordealphonenum.trim();
    }
}