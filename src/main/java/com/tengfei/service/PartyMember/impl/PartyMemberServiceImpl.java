package com.tengfei.service.PartyMember.impl;

import com.tengfei.dao.PartyMemberDao;
import com.tengfei.domain.PartyMember;
import com.tengfei.service.PartyMember.PartyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyMemberServiceImpl implements PartyMemberService {

    @Autowired
    private PartyMemberDao partyMemberDao;

    @Override
    public List<PartyMember> findAll() {
        return partyMemberDao.findAll();
    }

    @Override
    public int deleteOne(int id) {
        return partyMemberDao.deleteOne(id);
    }

    @Override
    public PartyMember findPartyMemberById(int id) {
        return partyMemberDao.findPartyMemberById(id);
    }

    @Override
    public void update(PartyMember partyMember) {
        partyMemberDao.update(partyMember);
    }

    @Override
    public void addPartyMember(PartyMember partyMember) {
        partyMemberDao.addPartyMember(partyMember);
    }

    @Override
    public List<PartyMember> findPartyMemberByKeyword(String keyword) {
        return partyMemberDao.findPartyMemberByKeyword(keyword);
    }
}
