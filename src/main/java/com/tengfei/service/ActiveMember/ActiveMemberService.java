package com.tengfei.service.ActiveMember;

import com.tengfei.domain.ActiveMember;

import java.util.List;

public interface ActiveMemberService {

    List<ActiveMember> findAll();

    int deleteOne(int id);

    ActiveMember findActiveMemberById(int id);

    void update(ActiveMember activeMember);

    void addActiveMember(ActiveMember activeMember);

    List<ActiveMember> findActiveMemberByKeyword(String keyword);

    void changeStatus(int status, int id);

    void saveErrorCase(int id, String errorCase);
}
