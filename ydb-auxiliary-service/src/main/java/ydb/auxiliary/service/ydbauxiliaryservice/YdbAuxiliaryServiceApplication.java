package ydb.auxiliary.service.ydbauxiliaryservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
//@MapperScan("ydb.auxiliary.service.ydbauxiliaryservice.dao")
public class YdbAuxiliaryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YdbAuxiliaryServiceApplication.class, args);
    }

}
