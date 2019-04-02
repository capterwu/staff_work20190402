package com.speed.cat.service;
import com.speed.cat.model.Member;
import java.util.Date;
import java.util.List;

/**
 * 描述:
 *
 * @author ganping
 * @create 2019/3/5 14:19
 */
public interface UserService {


    int save(List<Member> members, Date s);

    List<Member> getUUName(Date time);

    List<Member> findAll(Date time);


}
