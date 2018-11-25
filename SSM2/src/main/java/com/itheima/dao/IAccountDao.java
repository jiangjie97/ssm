package com.itheima.dao;

import com.itheima.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IAccountDao {
    /***
     * 查找所有用户
     * @return
     */
    @Select("SELECT * FROM account")
    List<Account> findAll();

    /***
     * 增加一个用户
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void AddAccount(Account account);
}
