package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @Author ljy
 * @Create 2025. 5. 9. 오후 2:55
 * @Version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/haha")
    public String hello() {
        return "Hello";
    }
}
