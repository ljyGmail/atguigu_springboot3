package com.atguigu.boot;

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

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
