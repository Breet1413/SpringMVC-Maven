package com.example.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;


/**
 * Created by Administrator on 2017/3/23.
 */
//自定义注解 适用类、接口（包括注解类型）或枚举，
@Retention(RetentionPolicy.RUNTIME)//RetentionPolicy还有好多其他参数，想知道可自行了解
@Target(ElementType.TYPE)
@Documented//注解表明这个注解应该被 javadoc工具记录
@Component//泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注
public @interface MyBatisDao {

}
