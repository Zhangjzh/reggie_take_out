package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangjzh
 * @data 2022/12/21 - 23:55
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
