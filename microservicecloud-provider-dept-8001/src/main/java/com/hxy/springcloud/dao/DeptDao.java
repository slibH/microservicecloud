package com.hxy.springcloud.dao;

import com.hxy.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: hexueyuan
 * @Name DeptDao
 * @Date: 2019-08-20 16:59
 * @Description:
 * @Version 1.0
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
