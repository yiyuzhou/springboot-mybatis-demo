package com.example.springbootmybatisdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author by yyz
 * on 2018/5/30
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(UserControllerTest.class);

    @Autowired
    private MockMvc mvc;

    @Test
    public void getUserList() throws Exception {
        logger.info("进入日志测试logback");
        mvc.perform(MockMvcRequestBuilders.get("/user/getUserInfo"))
                .andExpect(MockMvcResultMatchers.status().isOk());
        //.andExpect(MockMvcResultMatchers.content().string("365"));  //测试接口返回内容
    }
}
