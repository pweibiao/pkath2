package com.pkath2.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/20 21:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestPojo implements Serializable {
    private String id;
    private String name;
    private String bizType;
}
