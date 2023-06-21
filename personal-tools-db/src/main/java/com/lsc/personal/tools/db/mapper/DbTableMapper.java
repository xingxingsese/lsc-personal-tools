package com.lsc.personal.tools.db.mapper;

import com.lsc.personal.tools.db.bean.Column;
import com.lsc.personal.tools.db.bean.DataBase;
import com.lsc.personal.tools.db.bean.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DbTableMapper {


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
    List<Column> selectTableAllColumn(@Param("dataBase")String dataBase,@Param("tableName")String tableName);
}