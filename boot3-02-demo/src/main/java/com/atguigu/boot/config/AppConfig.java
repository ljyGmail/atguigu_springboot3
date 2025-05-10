package com.atguigu.boot.config;

import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * ClassName: AppConfig
 * Package: com.atguigu.boot.config
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 5. 10. 오전 10:58
 * @Version 1.0
 */
@Import(FastsqlException.class) // 给容器中放指定类型的组件，组件的名字默认是全类名
@SpringBootConfiguration // 这是一个配置类，替代以前的配置文件。配置类本身也是容器中的组件
// @Configuration
public class AppConfig {

    /**
     * 1. 组件默认是单实例的
     *
     * @return
     */
    @Scope("prototype")
    @Bean("userHaha") // 替代以前的Bean标签，组件在容器中的名字是方法名，可以直接修改注解的值
    public User user01() {
        var user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

//    @Bean
//    public FastsqlException fastsqlException() {
//
//        return new FastsqlException();
//    }

}
