package com.tengfei.dao;

import com.tengfei.domain.PartyMember;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartyMemberDao {

    @Select("select * from party_member")
    List<PartyMember> findAll();

    @Delete("delete from party_member where id = #{id}")
    int deleteOne(int id);

    @Select("select * from party_member where id = #{id}")
    PartyMember findPartyMemberById(int id);

    @Update("update party_member set name = #{name}, deptment = #{deptment}, joinPartyTime = #{joinPartyTime}," +
            "formalTime = #{formalTime}, idCard = #{idCard}, phone = #{phone}, gender = #{gender}, " +
            "address = #{address}, status = #{status}, imageSrc = #{imageSrc} where id = #{id}")
    void update(PartyMember partyMember);

    @Insert("insert into party_member values (null, #{name}, #{joinPartyTime}," +
            " #{formalTime}, #{deptment}, #{idCard}, #{phone}, #{gender}, #{address}, #{status}, #{imageSrc})")
    void addPartyMember(PartyMember partyMember);

    //mybatis模糊查询
    @Select("select * from party_member where name like '%${value}%'")
    List<PartyMember> findPartyMemberByKeyword(String keyword);
}
