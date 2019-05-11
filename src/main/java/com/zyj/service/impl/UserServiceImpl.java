package com.zyj.service.impl;

import com.zyj.dao.master.MasterUserDao;
import com.zyj.dao.slave.SlaveUserDao;
import com.zyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MasterUserDao masterUserDao;


    @Autowired
    private SlaveUserDao slaveUserDao;


    /**
     * 从不同数据库 查询 username
     * @return
     */
    @Override
    public Map<String,String> getUserName(){
        Map<String,String> map=new HashMap<>();
        // 从master 数据库查询
        map.put("master",masterUserDao.selectAllUser());
        // 从 slave 数据库查询
        map.put("slave",slaveUserDao.selectAllUser());
        return map;
    }
}
