package com.lsc.personal.tools.gui;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class PersonalToolsGuiApplication {


    public static void main(String[] args) {
        ApplicationContext ctx = new SpringApplicationBuilder(PersonalToolsGuiApplication.class)
                .headless(false).run(args);
        System.out.println("项目启动.........");
    }

}
