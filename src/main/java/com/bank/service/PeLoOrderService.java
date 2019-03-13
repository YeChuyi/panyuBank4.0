package com.bank.service;

import java.util.List;

import com.bank.bean.PeLoOrder;

public interface PeLoOrderService {
   List<PeLoOrder> getAll();
   
   List<PeLoOrder> getAllWhenPloDateBefore();

   PeLoOrder getPeLoOrderById(Integer id);//����ID��ȡ

int countPeLoOrderIndexData(String format);

int countPeLoOrderIndexData_All();

}
