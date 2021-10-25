package com.example.demo.dao;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

import org.springframework.stereotype.Component;


public class SqlMapClientConfig {

    private static SqlMapClient sqlMapClient;

    static{
        String path = "SqlMapConfig.xml";
        try {
            Reader reader = Resources.getResourceAsReader(path);
            sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
            System.out.println("connection success!");
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static SqlMapClient getSqlMapClient(){
        return sqlMapClient;
    }
}