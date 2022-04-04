package com.pkath2.springcloud.controller;

import com.pkath2.springcloud.Common.BaseController;
import com.pkath2.springcloud.Common.CommonResult;
import com.pkath2.springcloud.dto.BaseXMLDto;
import com.pkath2.springcloud.dto.ChatDataDto;
import com.pkath2.springcloud.dto.ChatStartDto;
import com.pkath2.springcloud.entities.TestPojo;
import com.pkath2.springcloud.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/23 15:14
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController extends BaseController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public int create(@RequestBody TestPojo pojo){
        return service.insert(pojo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<TestPojo> selectOneById(@PathVariable("id") String id){
        TestPojo testPojo = service.selectOneById(id);
        return success();
    }

    @RequestMapping(value = "/xml", method = RequestMethod.POST)
    public CommonResult<List<BaseXMLDto>> resolveXml(@RequestBody List<BaseXMLDto> pojos) {
        return success(pojos);
    }

    @RequestMapping(value = "/bigxml", method = RequestMethod.POST)
    public CommonResult<BaseXMLDto> resolveBigXml(@RequestBody BaseXMLDto pojo) {
//        pojo.setMsgId("100");
        return success(pojo);
    }

    @RequestMapping(value = "/chatStart", method = RequestMethod.POST)
    public CommonResult<BaseXMLDto> resolveChatStart(@RequestBody ChatStartDto pojo) {
//        pojo.setMsgId("100");
        return success(pojo);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<TestPojo> selectList(){
        return service.selectList();
    }

}