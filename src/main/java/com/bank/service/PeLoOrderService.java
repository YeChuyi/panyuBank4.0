package com.bank.service;

import java.util.List;

import com.bank.bean.PeLoOrder;

public interface PeLoOrderService {
   List<PeLoOrder> getAll();
   
   List<PeLoOrder> getAllWhenPloDateBefore();

   PeLoOrder getPeLoOrderById(Integer id);//根据ID获取

int countPeLoOrderIndexData(String format);

int countPeLoOrderIndexData_All();

}
