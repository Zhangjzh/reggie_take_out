package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangjzh
 * @data 2022/12/18 - 21:25
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
