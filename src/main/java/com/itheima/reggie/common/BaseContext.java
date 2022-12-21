package com.itheima.reggie.common;

/**
 * @author zhangjzh
 * @data 2022/12/21 - 19:31
 */

/**
 * 基于ThreadLocal封装工具类，用于保存和获取当前登录用户的id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
