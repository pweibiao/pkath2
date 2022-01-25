package com.pkath2.springcloud.service;

import com.pkath2.springcloud.entities.TestPojo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/20 22:52
 */
public interface TestService {
    int insert(TestPojo pojo);

    TestPojo selectOneById(String id);

    List<TestPojo> selectList();
}
