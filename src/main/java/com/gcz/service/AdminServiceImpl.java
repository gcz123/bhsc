package com.gcz.service;

import com.gcz.dao.AdminDao;
import com.gcz.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Admin login(String username, String password) {
        return adminDao.login(username,password);
    }
}
