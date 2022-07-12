package com.tengfei.dao;

import com.tengfei.domain.ActiveMember;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActiveMemberDao {

    @Select("select * from active_member")
    List<ActiveMember> findAll();

    @Delete("delete from active_member where id = #{id}")
    int deleteOne(int id);

    @Select("select * from active_member where id = #{id}")
    ActiveMember findActiveMemberById(int id);

    //无法修改status
    @Update("update active_member set name = #{name}, deptment = #{deptment}, activeTime = #{activeTime}," +
            "idCard = #{idCard}, phone = #{phone}, gender = #{gender}, " +
            "address = #{address}, imageSrc = #{imageSrc} where id = #{id}")
    void update(ActiveMember activeMember);

    //status默认为2 即未审核状态
    @Insert("insert into active_member values (null, #{name}, #{deptment}," +
            "#{activeTime}, #{idCard}, #{phone}, #{gender}, #{address}, 3, #{imageSrc}, null)")
    void addPartyMember(ActiveMember activeMember);

    //mybatis模糊查询
    @Select("select * from active_member where name like '%${value}%'")
    List<ActiveMember> findActiveMemberByKeyword(String keyword);

    @Update("update active_member set status = #{status} where id = #{id}")
    void changeStatus(@Param("status") int status, @Param("id") int id);

    @Update("update active_member set errorCase = #{errorCase} where id = #{id}")
    void saveErrorCase(@Param("id") int id, @Param("errorCase") String errorCase);
}
