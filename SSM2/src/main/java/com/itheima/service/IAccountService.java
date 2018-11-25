package com.itheima.service;

import com.itheima.pojo.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAccountService {

    /***
     * 查找所有用户
     * @return
     */
    List<Account> findAll();

    /***
     * 增加一个用户
     * @param account
     */
    void AddAccount(Account account);
}
