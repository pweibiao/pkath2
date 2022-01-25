package com.pkath2.springcloud.Common;

import java.util.UUID;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/23 15:54
 */
public class PojoUtil {

    public static String getUUID(){
        return UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }

}
