package com.prvoider.controller;

import com.common.pojo.User;
import com.prvoider.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping("/selectUserList")
    public List<User> selecUsertList(){
        return userMapper.selectList(null);
    }
    @GetMapping("/selectUserById/{id}")
    public User selectUserById(@PathVariable int id){
        return userMapper.selectById(id);
    }
}
