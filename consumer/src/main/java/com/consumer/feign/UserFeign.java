package com.consumer.feign;

import com.common.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@FeignClient("provider")
public interface UserFeign {
    @GetMapping("/provider/selectUserList")
    List<User> selecUsertList();
    @GetMapping("/provider/selectUserById/{id}")
    User selectUserById(@PathVariable int id);
}
