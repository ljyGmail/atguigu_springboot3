package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @Author ljy
 * @Create 2025. 5. 9. 오후 2:07
 * @Version 1.0
 */

//@ResponseBody
//@Controller

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot 3!!!";
    }
}
