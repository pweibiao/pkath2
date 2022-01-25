package com.pkath2.springcloud.controller;

import com.pkath2.springcloud.entities.TestPojo;
import com.pkath2.springcloud.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/23 15:14
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public int create(@RequestBody TestPojo pojo){
        return service.insert(pojo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TestPojo selectOneById(@PathVariable("id") String id){
        return service.selectOneById(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<TestPojo> selectList(){
        return service.selectList();
    }

}