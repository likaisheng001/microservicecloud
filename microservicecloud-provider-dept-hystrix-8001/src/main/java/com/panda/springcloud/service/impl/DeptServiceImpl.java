package com.panda.springcloud.service.impl;

import com.panda.springcloud.dao.DeptDao;
import com.panda.springcloud.entities.Dept;
import com.panda.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17.
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }
}
