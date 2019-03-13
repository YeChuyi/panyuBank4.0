package com.bank.bean;
import java.io.Serializable;

/**
 * Created by yankang on 2018/5/31.
 */
public class ResponseData implements Serializable{

    private  String code;//�ɹ���״̬�룬Ĭ�ϣ�0
    private String msg;//״̬��Ϣ���ֶ����ƣ�Ĭ�ϣ�msg
    private String count;//�����������ֶ����ƣ�Ĭ�ϣ�count
    private Object data;//�����б���ֶ����ƣ�Ĭ�ϣ�data

    public ResponseData() {
    }

    public ResponseData(String code, String msg, String count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", count='" + count + '\'' +
                ", data=" + data +
                '}';
    }
}

