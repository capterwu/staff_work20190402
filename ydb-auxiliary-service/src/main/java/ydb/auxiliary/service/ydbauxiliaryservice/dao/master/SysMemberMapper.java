package ydb.auxiliary.service.ydbauxiliaryservice.dao.master;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ydb.auxiliary.service.ydbauxiliaryservice.model.SysMember;
import ydb.auxiliary.service.ydbauxiliaryservice.model.SysMemberExample;

@Repository
public interface SysMemberMapper {
    long countByExample(SysMemberExample example);

    int deleteByExample(SysMemberExample example);

    int insert(SysMember record);

    int insertSelective(SysMember record);

    List<SysMember> selectByExample(SysMemberExample example);

    int updateByExampleSelective(@Param("record") SysMember record, @Param("example") SysMemberExample example);

    int updateByExample(@Param("record") SysMember record, @Param("example") SysMemberExample example);


    @Select("select  mem.*,mem.ACCOUNT_NAME as accountName,mem.REAL_NAME as realName from  sys_member as mem where ID=#{id}")
    SysMember selectById(Long id);

}