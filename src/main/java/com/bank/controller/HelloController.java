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
        String b ="正式环境代码";
        String a="bbbb";
        String c="第二次正式环境代码";
        String c1 ="开发环境dev";
        return "hello,第二次开发环境和正式环境合并";
    }

    @RequestMapping("/hello2")
    public String personalDetail2(@RequestParam(value = "id") String id, Map<String, Object> map){
        String b ="美宝第一次提交";
        return "hello,第一次开发环境和正式环境合并";
    }
}
