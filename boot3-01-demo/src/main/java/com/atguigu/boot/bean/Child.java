package com.atguigu.boot.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * ClassName: Child
 * Package: com.atguigu.boot.bean
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 5. 11. 오후 12:23
 * @Version 1.0
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private Date birthday;
    private List<String> text;
}
