package com.bank.controller;


import com.bank.bean.PeLoOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    //你好，控制层
    @RequestMapping("/hello")
    public String personalDetail(@RequestParam(value = "id") String id, Map<String, Object> map){
        String a="bbbb";
        String c ="开发环境dev";
        return "hello,开发环境修改";
    }
}
