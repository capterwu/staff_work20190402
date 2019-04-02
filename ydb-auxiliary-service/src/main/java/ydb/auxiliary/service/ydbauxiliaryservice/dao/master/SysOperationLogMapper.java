package ydb.auxiliary.service.ydbauxiliaryservice.dao.master;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ydb.auxiliary.service.ydbauxiliaryservice.model.SysOperationLog;
import ydb.auxiliary.service.ydbauxiliaryservice.model.SysOperationLogExample;

@Repository
public interface SysOperationLogMapper {
    long countByExample(SysOperationLogExample example);

    int deleteByExample(SysOperationLogExample example);

    int insert(SysOperationLog record);

    int insertSelective(SysOperationLog record);

    List<SysOperationLog> selectByExample(SysOperationLogExample example);

    int updateByExampleSelective(@Param("record") SysOperationLog record, @Param("example") SysOperationLogExample example);

    int updateByExample(@Param("record") SysOperationLog record, @Param("example") SysOperationLogExample example);
}