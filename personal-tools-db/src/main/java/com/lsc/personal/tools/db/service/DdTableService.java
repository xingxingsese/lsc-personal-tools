package com.lsc.personal.tools.db.service;

import com.lsc.personal.tools.db.bean.Column;
import com.lsc.personal.tools.db.bean.DataBase;
import com.lsc.personal.tools.db.bean.Table;

import java.util.List;

/**
 * @Description:
 * @Author: lisc
 * @date: 2023/6/11
 */
public interface DdTableService {
    /**
     * 查所有库
     * @return
     */
    List<DataBase> selectAllDataBase();

    /**
     * 查当前库所有表
     * @return
     */
    List<Table> selectAllTable(String dataBase);

    /**
     * 查当前表所有列
     * @return
     */
    List<Column> selectTableAllColumn(String dataBase, String tableName);
}
