package com.tengfei.service;

import com.tengfei.domain.ActiveMember;
import com.tengfei.domain.Manager;

import java.util.List;

public interface ManagerService {

    Manager loginByAccountAndPassword(String workNum, String password);

    List<ActiveMember> findExamineMembers(int status);
}
