package com.example.springbootmybatisdemo.contorller;

import com.alibaba.fastjson.JSON;
import com.example.springbootmybatisdemo.entity.EmployeeProperties;
import com.example.springbootmybatisdemo.entity.User;
import com.example.springbootmybatisdemo.service.UserService;
import com.example.springbootmybatisdemo.utils.MyPropsUtils;
import com.example.springbootmybatisdemo.utils.YmlConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by yyz
 * on 2018/5/28
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmployeeProperties employeeProperties;

    @Autowired
    private YmlConfig config;

    @Value("${employee.salary}")
    private String javaStr;

    @Value("${employee.title}")
    private String version;

    @RequestMapping("/getUserInfo")
    public @ResponseBody
    List<User> getUserInfo() throws Exception{
        List<User> user = userService.getUserInfo();
        System.out.println(JSON.toJSON(user));
        System.out.println(employeeProperties.getSalary());
        System.out.println(employeeProperties.getTitle());
        System.out.println(javaStr);
        System.out.println(version);


        ObjectMapper objectMapper = new ObjectMapper();
        //测试加载yml文件
        System.out.println("simpleProp: " + config.getSimpleProp());
        System.out.println("arrayProps: " + objectMapper.writeValueAsString(config.getArrayProps()));
        System.out.println("listProp1: " + objectMapper.writeValueAsString(config.getListProp1()));
        System.out.println("listProp2: " + objectMapper.writeValueAsString(config.getListProp2()));
        System.out.println("mapProps: " + objectMapper.writeValueAsString(config.getMapProps()));

        return user;
    }



    @RequestMapping("/")
    public String index(Model model){
        List<User> users = userService.getUserInfo();
        User user = users.get(0);
        model.addAttribute("user" , user);
        model.addAttribute("age" , "age");
        return "index";
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
//        yaml.setResources(new FileSystemResource("application.yml"));//File引入
      yaml.setResources(new ClassPathResource("config/application-temp.yml"));//class引入
        configurer.setProperties(yaml.getObject());
        return configurer;
    }
}
