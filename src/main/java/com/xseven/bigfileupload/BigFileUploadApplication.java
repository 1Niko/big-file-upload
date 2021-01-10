package com.xseven.bigfileupload;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xseven.bigfileupload.mapper")
public class BigFileUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigFileUploadApplication.class, args);
    }

}
