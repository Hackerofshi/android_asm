package com.shi.android_base;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Client {

    @Test
    public void test() throws Exception {
        try {
//            //获取文件
//            File springConfigFile = new File("D:\\file\\asproject\\android_base\\config.txt");
//            //读取配置
//            Properties config= new Properties();
//            config.load(new FileInputStream(springConfigFile));

            //获取类路径
            String classPath = "com.shi.android_base.test.Business1";
            //获取方法名
            String methodName = "doBusiness1Function";


            //反射创建实例病调用方法
            Class aClass = Class.forName(classPath);
            Constructor declaredConstructor = aClass.getDeclaredConstructor();
            Object o = declaredConstructor.newInstance();
            Method declaredMethod = aClass.getDeclaredMethod(methodName);
            declaredMethod.invoke(o);

        } catch ( ClassNotFoundException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }


    }
}
