package com.pkath2.springcloud.service.impl;

import com.pkath2.springcloud.Common.PojoUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Scanner;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/20 23:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceImplTest {

    @Test
    public void test() {
        String s = PojoUtil.getUUID();
        System.out.println(s);
    }
}