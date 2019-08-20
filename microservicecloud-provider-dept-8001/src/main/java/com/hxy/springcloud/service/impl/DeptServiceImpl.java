package com.hxy.springcloud.service.impl;

import com.hxy.springcloud.dao.DeptDao;
import com.hxy.springcloud.entities.Dept;
import com.hxy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: hexueyuan
 * @Name DeptServiceImpl
 * @Date: 2019-08-20 17:07
 * @Description:
 * @Version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
