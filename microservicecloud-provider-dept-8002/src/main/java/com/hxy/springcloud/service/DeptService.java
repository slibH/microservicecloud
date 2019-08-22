package com.hxy.springcloud.service;

import com.hxy.springcloud.entities.Dept;

import java.util.List;

/**
 * @Author: hexueyuan
 * @Name DeptService
 * @Date: 2019-08-20 17:06
 * @Description:
 * @Version 1.0
 */
public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
