package com.bank.controller;

import java.util.Map;

import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bank.bean.Admin;
import com.bank.service.AdminService;


@RequestMapping("/admin")

@SessionAttributes("admin")
@Controller
public class AdminController {
   @Autowired
   AdminService adminservice;
   
   @RequestMapping("/login")
   public String login(Map<String, Object> map){
	   return "login";
   }
   
   @RequestMapping(value="checkLogin",method=RequestMethod.POST)
   public String checkLogin(@Valid Admin admin,Model model){
	   //�鿴�����ֵ
	    System.out.println(admin.getAdminuser());
	    System.out.println(admin.getAdminpassword());
       //����service����
       admin = adminservice.checkLogin(admin.getAdminuser(), admin.getAdminpassword());
       //����user����ӵ�model�ﲢ����ת���ɹ�ҳ��
       if(admin != null){
           model.addAttribute("admin",admin);
           return "redirect:/index";
       }
       return "fail";
   }

}
