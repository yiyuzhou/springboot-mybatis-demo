package com.example.springbootmybatisdemo.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author by yyz
 * on 2018/5/28
 */

@Component
public class MyPropsUtils {
    private String simpleProp;
    private Map<String, String> mapProps = new HashMap<>(); //接收prop1里面的属性值

    public String getSimpleProp() {
        return simpleProp;
    }

    public void setSimpleProp(String simpleProp) {
        this.simpleProp = simpleProp;
    }


    public Map<String, String> getMapProps() {
        return mapProps;
    }

    public void setMapProps(Map<String, String> mapProps) {
        this.mapProps = mapProps;
    }
}
