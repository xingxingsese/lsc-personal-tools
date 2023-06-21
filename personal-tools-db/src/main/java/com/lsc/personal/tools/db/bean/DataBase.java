package com.lsc.personal.tools.db.bean;

import lombok.Data;

import java.sql.Date;
import java.util.List;

/**
 * @Description: 数据库信息
 * @Author: lisc
 * @date: 2023/6/11
 */
@Data
public class DataBase {

    /**
     * 库名
     */
    private String tableSchema;

    /**
     * 库引擎
     */
    private String engine;

    /**
     * 库创建时间
     */
    private Date createTime;

    /**
     * 当前库中的表
     */
    private List<Table> table;



}
