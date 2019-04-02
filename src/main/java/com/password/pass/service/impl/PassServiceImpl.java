package com.password.pass.service.impl;

import com.password.pass.service.PassService;
import com.password.pass.util.PassWordAlgorithmUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/4/1 17:36
 */
@Service
public class PassServiceImpl implements PassService {


    @Value("${initial.value}")
    private int num;


    @Autowired
    @Qualifier("redisTemplate")
    RedisTemplate redisTemplate;


    @Override
    public List<String> getPassList() {
        PassWordAlgorithmUtil.recursion(num, 1);
        List<String> stringList = PassWordAlgorithmUtil.list;
       redisTemplate.opsForValue().set("list",stringList,60);
        return PassWordAlgorithmUtil.list;
    }
}
