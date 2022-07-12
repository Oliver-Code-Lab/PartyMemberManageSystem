package com.tengfei.service;

import com.tengfei.dao.ManagerDao;
import com.tengfei.domain.ActiveMember;
import com.tengfei.domain.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao managerDao;

    @Override
    public Manager loginByAccountAndPassword(String workNum, String password) {
        return managerDao.loginByAccountAndPassword(workNum, password);
    }

    @Override
    public List<ActiveMember> findExamineMembers(int status) {
        return managerDao.findExamineMembers(status);
    }
}
