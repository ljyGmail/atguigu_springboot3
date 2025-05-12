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
    public String hello(String a, String b) {
        for (int i = 0; i < 1000; i++) {
            log.trace("trace 日志...");
            log.debug("debug 日志...");
            // SpringBoot底层默认的日志级别 info
            log.info("info 日志... 参数a: {}, b: {}", a, b);
            log.warn("warn 日志...");
            log.error("error 日志...");
        }

        return "hello";
    }
}
