package com.lsc.personal.tools.db.service.impl;

import com.lsc.personal.tools.db.bean.Column;
import com.lsc.personal.tools.db.bean.DataBase;
import com.lsc.personal.tools.db.bean.Table;
import com.lsc.personal.tools.db.mapper.DbTableMapper;
import com.lsc.personal.tools.db.service.DdTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: lisc
 * @date: 2023/6/11
 */
@Service
public class DbTableServiceImpl implements DdTableService {

    @Autowired
    DbTableMapper dbTableMapper;

    @Override
    public List<DataBase> selectAllDataBase() {
        return dbTableMapper.selectAllDataBase();
    }

    @Override
    public List<Table> selectAllTable(String dataBase) {
        return dbTableMapper.selectAllTable(dataBase);
    }

    @Override
    public List<Column> selectTableAllColumn(String dataBase, String tableName) {
        return dbTableMapper.selectTableAllColumn(dataBase,tableName);
    }
}
