package com.prvoider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.common.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
