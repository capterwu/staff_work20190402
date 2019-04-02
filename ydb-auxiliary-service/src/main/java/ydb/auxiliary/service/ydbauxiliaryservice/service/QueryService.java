package ydb.auxiliary.service.ydbauxiliaryservice.service;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/27 12:04
 */
public interface QueryService {

    /**
     * 查询出余额大于0的用户
     *
     * @return
     */
    List<Long> selctMemberId();


    /**
     * 查询 日期 在40天之内的
     *
     * @return
     */
    List<Long> selectLibary(Map<String, Object> map);


    /**
     * 对比差集
     * @param var
     * @param val
     * @return
     */
    List<Long> differenceSet(List<Long> var ,List<Long> val);

}
