package com.pkath2.springcloud.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/20 21:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private T date;

    public CommonResult(Integer code) {
        super();
        this.code = code;
    }

    public static <T> CommonResult<T> newInstance() {
        return new CommonResult<T>(200);
    }

    public static <T> CommonResult<T> success(){
        return newInstance();
    }

    public static <T> CommonResult<T> success(T entity){
        return new CommonResult(200, entity);
    }
}
