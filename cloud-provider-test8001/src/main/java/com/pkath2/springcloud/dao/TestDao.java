package com.pkath2.springcloud.dao;

import com.pkath2.springcloud.entities.TestPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/20 22:02
 */
@Mapper
public interface TestDao {

    int insert(TestPojo pojo);

    TestPojo selectOneById(@Param("id") String id);

    List<TestPojo> selectList();
}
