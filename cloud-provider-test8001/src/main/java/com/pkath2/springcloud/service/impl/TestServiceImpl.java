package com.pkath2.springcloud.service.impl;

import com.pkath2.springcloud.Common.PojoUtil;
import com.pkath2.springcloud.dao.TestDao;
import com.pkath2.springcloud.entities.TestPojo;
import com.pkath2.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/20 22:53
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public int insert(TestPojo pojo) {
        if (pojo.getId() == null) {
            pojo.setId(PojoUtil.getUUID());
        }
        return testDao.insert(pojo);
    }

    @Override
    public TestPojo selectOneById(String id) {
        return testDao.selectOneById(id);
    }

    @Override
    public List<TestPojo> selectList() {
        return testDao.selectList();
    }
}
