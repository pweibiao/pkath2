package com.pkath2.springcloud.Common;

public class BaseController {

    protected <T> CommonResult<T> success() {
        return CommonResult.success();
    }

    protected <T> CommonResult<T> success(T entity) {
        return CommonResult.success(entity);
    }

}
