package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pig;
import com.atguigu.boot.bean.Sheep;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
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
//@Import(FastsqlException.class) // 给容器中放指定类型的组件，组件的名字默认是全类名
@SpringBootConfiguration // 这是一个配置类，替代以前的配置文件。配置类本身也是容器中的组件
// @Configuration
/**
 * 1. 开启Sheep组件的属性绑定
 * 2. 默认会把这个组件自己放到容器中
 */
@EnableConfigurationProperties(Sheep.class) // 导入第三方写好的组件进行属性绑定
// SpringBoot默认只扫描自己主程序所在的包。如果导入第三方包，即使组件上标注了@Component、@ConfigurationProperties注解，也没用。因为组件都扫描不进来。
public class AppConfig {

    @ConfigurationProperties(prefix = "pig")
    @Bean
    public Pig pig() {
        return new Pig(); // 我们自己new的新pig
    }


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
