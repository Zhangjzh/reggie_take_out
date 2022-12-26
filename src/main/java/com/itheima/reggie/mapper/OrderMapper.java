package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangjzh
 * @data 2022/12/27 - 0:51
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
