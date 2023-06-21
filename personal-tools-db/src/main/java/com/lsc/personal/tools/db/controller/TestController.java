package com.lsc.personal.tools.db.controller;

import com.alibaba.fastjson.JSONObject;
import com.lsc.personal.tools.db.bean.Column;
import com.lsc.personal.tools.db.service.DdTableService;
import com.lsc.personal.tools.db.service.impl.DbTableServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: lisc
 * @date: 2023/6/12
 */
@RestController
public class TestController {

    @Autowired
    DdTableService dbTableService;

    @GetMapping("/")
    public String test(){
        List<Column> columns = dbTableService.selectTableAllColumn("guli_admin", "qrtz_blob_triggers");
        System.out.println(JSONObject.toJSONString(columns));
        return "OK";
    }
}
