package com.bank.controller;


import com.bank.bean.PeLoOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    //��ã����Ʋ�

    @RequestMapping("/hello")
    public String personalDetail(@RequestParam(value = "id") String id, Map<String, Object> map){
        String b ="��ʽ��������";
        String a="bbbb";
        return "hello,��һ�ο�����������ʽ�����ϲ�";
    }
}
