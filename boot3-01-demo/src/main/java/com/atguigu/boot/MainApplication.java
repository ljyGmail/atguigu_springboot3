package com.atguigu.boot;

import com.atguigu.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: MainApplication
 * Package: com.atguigu.boot
 * Description: 启动SpringBoot项目的主入口程序
 *
 * @Author ljy
 * @Create 2025. 5. 9. 오후 2:05
 * @Version 1.0
 */

// 主程序: com.atguigu.boot
// com.atguigu.boot.controller
// @SpringBootApplication(scanBasePackages = "com.atguigu")
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.atguigu")
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // Java10: 局部变量类型的自动推断
        var ioc = SpringApplication.run(MainApplication.class, args);

        // 1. 获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();

        // 2. 挨个遍历: dispatcherServlet、beanNameResolver、characterEncodingFilter、multipartResolver
        // SpringBoot把以前配置的核心组件现在都给我们自动给配置好了
        for (String name : names) {
            System.out.println(name);
        }

        Person person = ioc.getBean(Person.class);
        System.out.println("person: " + person);

        System.out.println("===== 用|表示大文本，会保留格式");
        var s1 = person.getChild().getText().get(2);
        System.out.println("s1: " + s1);

        System.out.println("===== 用>表示大文本，会压缩换行变成空格");
        var s2 = person.getChild().getText().get(3);
        System.out.println("s2: " + s2);
    }
}
