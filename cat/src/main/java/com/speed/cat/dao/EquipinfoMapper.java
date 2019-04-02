package com.speed.cat.dao;

import com.speed.cat.model.Equipinfo;
import com.speed.cat.model.EquipinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipinfoMapper {
    long countByExample(EquipinfoExample example);

    int deleteByExample(EquipinfoExample example);

    int insert(Equipinfo record);

    int insertSelective(Equipinfo record);

    List<Equipinfo> selectByExample(EquipinfoExample example);

    int updateByExampleSelective(@Param("record") Equipinfo record, @Param("example") EquipinfoExample example);

    int updateByExample(@Param("record") Equipinfo record, @Param("example") EquipinfoExample example);
}