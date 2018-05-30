package com.example.springbootmybatisdemo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author by yyz
 * on 2018/5/28
 */

@Component
@ConfigurationProperties(prefix = "employee")
@Setter @Getter
public class EmployeeProperties {

    private String salary;

    private String title;
}
