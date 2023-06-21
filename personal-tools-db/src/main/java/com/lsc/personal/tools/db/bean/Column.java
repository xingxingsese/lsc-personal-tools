package com.lsc.personal.tools.db.bean;

import lombok.Data;

/**
 * @Description:
 * @Author: lisc
 * @date: 2023/6/11
 */
@Data
public class Column {

    /**
     * 列名
     */
    private String columnName;

    /**
     * 列类型
     */
    private String columnType;

    /**
     * 是否可以为null
     */
    private String isNull;

    /**
     * 是否为主键
     */
    private String columnKey ;

    /**
     * 默认值
     */
    private String defaultVlue ;

    /**
     * 描述
     */
    private String extra ;

}
