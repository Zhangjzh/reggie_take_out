package com.itheima.test;

import org.junit.jupiter.api.Test;

/**
 * @author zhangjzh
 * @data 2022/12/22 - 13:03
 */
public class UploadFileTest {
    @Test
    public void test1(){
        String fileName ="dasrewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
