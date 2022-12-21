package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @author zhangjzh
 * @data 2022/12/21 - 22:58
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
