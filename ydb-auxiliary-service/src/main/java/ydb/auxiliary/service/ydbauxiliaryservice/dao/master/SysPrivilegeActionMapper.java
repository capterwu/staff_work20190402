package ydb.auxiliary.service.ydbauxiliaryservice.dao.master;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ydb.auxiliary.service.ydbauxiliaryservice.model.SysPrivilegeAction;
import ydb.auxiliary.service.ydbauxiliaryservice.model.SysPrivilegeActionExample;

@Repository
public interface SysPrivilegeActionMapper {
    long countByExample(SysPrivilegeActionExample example);

    int deleteByExample(SysPrivilegeActionExample example);

    int insert(SysPrivilegeAction record);

    int insertSelective(SysPrivilegeAction record);

    List<SysPrivilegeAction> selectByExample(SysPrivilegeActionExample example);

    int updateByExampleSelective(@Param("record") SysPrivilegeAction record, @Param("example") SysPrivilegeActionExample example);

    int updateByExample(@Param("record") SysPrivilegeAction record, @Param("example") SysPrivilegeActionExample example);

    @Select({"select * from sys_privilege_action where  code=#{code}"
    })
    SysPrivilegeAction selectByCode(String code);

}