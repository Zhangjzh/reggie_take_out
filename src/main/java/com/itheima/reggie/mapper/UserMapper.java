package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangjzh
 * @data 2022/12/25 - 0:02
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
