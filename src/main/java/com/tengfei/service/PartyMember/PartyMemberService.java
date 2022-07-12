package com.tengfei.service.PartyMember;

import com.tengfei.domain.PartyMember;

import java.util.List;

public interface PartyMemberService {

    List<PartyMember> findAll();

    int deleteOne(int id);

    PartyMember findPartyMemberById(int id);

    void update(PartyMember partyMember);

    void addPartyMember(PartyMember partyMember);

    List<PartyMember> findPartyMemberByKeyword(String keyword);
}
