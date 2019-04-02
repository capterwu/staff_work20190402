package com.password.pass.controller;

import com.alibaba.fastjson.JSONObject;
import com.password.pass.service.PassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.jar.JarInputStream;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/4/1 18:27
 */
@RestController
@RequestMapping("/get")
public class PassController {


    @Autowired
    private PassService passService;

    @Autowired
    @Qualifier("redisTemplate")
    RedisTemplate redisTemplate;


    @GetMapping("/ssl")
    public String ssl() {

        return "成功改成https 请求";
    }


    @GetMapping("/getredis")
    public String get() {
        passService.getPassList();
        Object o = redisTemplate.opsForValue().get("list");
        return JSONObject.toJSONString(o);
    }

}
