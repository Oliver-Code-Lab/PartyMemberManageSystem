package com.tengfei.dao;

import com.tengfei.domain.ActiveMember;
import com.tengfei.domain.Manager;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerDao {

    @Select("select * from manager where workNum = #{workNum} and password = #{password}")
    Manager loginByAccountAndPassword(@Param("workNum") String workNum, @Param("password") String password);

    @Select("select * from active_member where status = #{status}")
    List<ActiveMember> findExamineMembers(int status);
}
