package com.speed.cat.dao;

import com.speed.cat.model.Member;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {

    @Insert({
            "<script>",
            "insert into member (OPENID, nick_name,HEAD_IMG,M_TYPE,M_GROUP,ISRECEIVE,ISWITHDRAW,ISBLOCK,REGISTTIME,SEX,OPENID_MP,UNIONID )values ",
            "<foreach collection='members' item='item' index='index' separator=','>",
            "( #{item.openid}, #{item.nickName},#{item.headImg}, #{item.mType}, #{item.mGroup},#{item.isreceive},#{item.iswithdraw}, #{item.isblock},#{time}, #{item.sex},#{item.openidMp},#{item.unionid})",
            "</foreach>",
            "</script>"
    })
    int save(@Param("members") List<Member> members, @Param("time") Date time);


    @Select("select me.ID as id from  member as me where me.REGISTTIME >=#{time}")
    List<Member> findAll(Date time);


}