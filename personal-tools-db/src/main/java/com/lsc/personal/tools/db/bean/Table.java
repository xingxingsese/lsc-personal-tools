package com.lsc.personal.tools.db.bean;

import com.lsc.personal.tools.db.bean.Column;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: lisc
 * @date: 2023/6/11
 */
@Data
public class Table {

    /**
     * 所属库
     */
    private String tableSchema;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 表名注释
     */
    private String tableNameExtra;

    /**
     * 数据库类型
     */
    private String dbType;

    /**
     * 表中列信息
     */
    private List<Column> columnList;


}
