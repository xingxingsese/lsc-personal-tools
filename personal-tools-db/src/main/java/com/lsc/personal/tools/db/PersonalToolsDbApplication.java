package com.lsc.personal.tools.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lsc.personal.tools.db.mapper")
public class PersonalToolsDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalToolsDbApplication.class, args);
        System.out.println("项目启动");
    }

}
