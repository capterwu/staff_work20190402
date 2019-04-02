package ydb.auxiliary.service.ydbauxiliaryservice.dao.master;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ydb.auxiliary.service.ydbauxiliaryservice.model.SysMemberwalletPro;
import ydb.auxiliary.service.ydbauxiliaryservice.model.SysMemberwalletProExample;

public interface SysMemberwalletProMapper {
    long countByExample(SysMemberwalletProExample example);

    int deleteByExample(SysMemberwalletProExample example);

    int insert(SysMemberwalletPro record);

    int insertSelective(SysMemberwalletPro record);

    List<SysMemberwalletPro> selectByExample(SysMemberwalletProExample example);

    int updateByExampleSelective(@Param("record") SysMemberwalletPro record, @Param("example") SysMemberwalletProExample example);

    int updateByExample(@Param("record") SysMemberwalletPro record, @Param("example") SysMemberwalletProExample example);




}