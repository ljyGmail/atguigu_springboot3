package com.atguigu.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.atguigu.logging.controller
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 5. 11. 오후 5:53
 * @Version 1.0
 */
@RestController
@Slf4j
public class HelloController {

//    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/h")
    public String hello() {
        log.info("哈哈哈，方法进来了");
//        logger.info("哈哈哈，方法进来了");
        return "hello";
    }
}
