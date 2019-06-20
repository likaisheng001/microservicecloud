package com.panda.springcloud.service;

import com.panda.springcloud.entities.Dept;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17.
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
