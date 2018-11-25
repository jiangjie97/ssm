package com.itheima.controller;

import com.itheima.pojo.Account;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
private IAccountService accountService;
    @RequestMapping("/findAccount")
    public String findAccount() {
        System.out.println("controller的findAccount方法执行了");
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        return "success";
    }

}
