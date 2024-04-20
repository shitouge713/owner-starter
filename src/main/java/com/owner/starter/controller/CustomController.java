package com.owner.starter.controller;


import com.owner.starter.annotation.CustomAnnotation;
import com.owner.starter.annotation.MyLog;
import com.owner.starter.request.CouponBatchItemReqVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CustomController {

    @MyLog(value = "测试日志写入", type = "2")
    @CustomAnnotation
    @GetMapping("/test")
    public String sendMsg( @Valid CouponBatchItemReqVO msg) {
        return "发送成功";
    }
}
