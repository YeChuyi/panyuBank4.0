package com.bank.bean;

import java.util.Date;

public class PeLoOrderNum {
    private Integer id;

    private Date date;

    private String week;

    private String time;

    private Integer num;

    private String open;

    private Integer already;
     public PeLoOrderNum(){
    	 
     }
    public PeLoOrderNum(Integer id, Date date, String week, String time, Integer num, String open, Integer already) {
		super();
		this.id = id;
		this.date = date;
		this.week = week;
		this.time = time;
		this.num = num;
		this.open = open;
		this.already = already;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open == null ? null : open.trim();
    }

    public Integer getAlready() {
        return already;
    }

    public void setAlready(Integer already) {
        this.already = already;
    }
}