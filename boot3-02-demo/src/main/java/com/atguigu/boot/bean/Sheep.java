package com.atguigu.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClassName: Sheep
 * Package: com.atguigu.boot.bean
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 5. 10. 오후 12:35
 * @Version 1.0
 */

// @Component
@ConfigurationProperties(prefix = "sheep")
public class Sheep {
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
