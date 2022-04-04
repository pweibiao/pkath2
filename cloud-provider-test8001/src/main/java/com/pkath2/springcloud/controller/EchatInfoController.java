package com.pkath2.springcloud.controller;


import com.pkath2.springcloud.Common.BaseController;
import com.pkath2.springcloud.Common.CommonResult;
import com.pkath2.springcloud.dto.BaseXMLDto;
import com.pkath2.springcloud.service.EchatInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class EchatInfoController extends BaseController {

    @Autowired
    private EchatInfoService service;

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public CommonResult<BaseXMLDto> resolveChatStart(@RequestBody BaseXMLDto pojo) {

        return success(pojo);
    }


}
