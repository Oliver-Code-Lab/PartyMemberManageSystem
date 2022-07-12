package com.tengfei.service.ActiveMember.impl;

import com.tengfei.dao.ActiveMemberDao;
import com.tengfei.domain.ActiveMember;
import com.tengfei.service.ActiveMember.ActiveMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiveMemberServiceImpl implements ActiveMemberService {

    @Autowired
    private ActiveMemberDao activeMemberDao;

    @Override
    public List<ActiveMember> findAll() {
        return activeMemberDao.findAll();
    }

    @Override
    public int deleteOne(int id) {
        return activeMemberDao.deleteOne(id);
    }

    @Override
    public ActiveMember findActiveMemberById(int id) {
        return activeMemberDao.findActiveMemberById(id);
    }

    @Override
    public void update(ActiveMember activeMember) {
        activeMemberDao.update(activeMember);
    }

    @Override
    public void addActiveMember(ActiveMember activeMember) {
        activeMemberDao.addPartyMember(activeMember);
    }

    @Override
    public List<ActiveMember> findActiveMemberByKeyword(String keyword) {
        System.out.println(keyword);
        return activeMemberDao.findActiveMemberByKeyword(keyword);
    }

    @Override
    public void changeStatus(int status, int id) {
        activeMemberDao.changeStatus(status, id);
    }

    @Override
    public void saveErrorCase(int id, String errorCase) {
        System.out.println(errorCase);
        activeMemberDao.saveErrorCase(id, errorCase);
    }
}
