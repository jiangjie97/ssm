package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.pojo.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("执行了AccountService的查询方法");
        return accountDao.findAll();

    }

    @Override
    public void AddAccount(Account account) {

    }
}
