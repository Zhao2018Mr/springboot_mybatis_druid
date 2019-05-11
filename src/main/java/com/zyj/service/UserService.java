package com.zyj.service;

import java.util.Map;

public interface UserService {

    /**
     * 从不同数据库查询username
     * @return
     */
    public Map<String,String> getUserName();
}
