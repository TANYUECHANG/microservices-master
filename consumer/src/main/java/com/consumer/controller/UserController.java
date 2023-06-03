package com.consumer.controller;

import com.common.pojo.User;
import com.consumer.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class UserController {
    @Autowired
    UserFeign UserFeign;
    @GetMapping("/selectUserList")
    public List<User> selecUsertList(){
        return UserFeign.selecUsertList();
    }
    @GetMapping("/selectUserById/{id}")
    public User selectUserById(@PathVariable int id){
        return UserFeign.selectUserById(id);
    }
}
