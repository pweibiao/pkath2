package com.pkath2.springcloud.controller;

import com.pkath2.springcloud.Common.BaseController;
import com.pkath2.springcloud.Common.CommonResult;
import com.pkath2.springcloud.entities.TestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/23 17:27
 */
@RestController
@RequestMapping("/testconsumer")
public class ConsumerController extends BaseController {

//    public static final String PROVIDER_URL = "http://10.1.1.134:8001";
    public static final String PROVIDER_URL = "http://127.0.0.1:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public CommonResult<TestPojo> create(TestPojo pojo) {
        restTemplate.postForObject(PROVIDER_URL+"/test", pojo, TestPojo.class);
        return success();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TestPojo selectOneById(@PathVariable("id")String id) {
        return restTemplate.getForObject(PROVIDER_URL+"/test/"+id, TestPojo.class);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult<List<TestPojo>> selectList() {
        return success(restTemplate.getForObject(PROVIDER_URL+"/test/list", List.class));
    }
}
