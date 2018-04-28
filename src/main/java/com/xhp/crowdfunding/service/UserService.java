package com.xhp.crowdfunding.service;

import com.xhp.crowdfunding.dao.UserMapper;
import com.xhp.crowdfunding.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: luqinglin
 * Date: 2018-04-28
 * Time: 9:55
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(String username,String password){
        return userMapper.selectByUsernameAndPassword(username,password);
    }

    public List<User> searchAll(){
        return userMapper.selectAll();
    }

}
