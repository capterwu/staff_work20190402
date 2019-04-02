package ydb.auxiliary.service.ydbauxiliaryservice.service.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ydb.auxiliary.service.ydbauxiliaryservice.dao.cluster.OrderLibraryMapper;
import ydb.auxiliary.service.ydbauxiliaryservice.dao.master.MemberMapper;
import ydb.auxiliary.service.ydbauxiliaryservice.service.QueryService;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/27 12:04
 */
@Service
public class QueryServiceImpl implements QueryService {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private OrderLibraryMapper orderLibraryMapper;

    @Override
    public List<Long> selctMemberId() {
        return memberMapper.select();
    }

    @Override
    public List<Long> selectLibary(Map<String, Object> map) {
        return orderLibraryMapper.queryLia((Date) map.get("ordertime"));
    }

    @Override
    public List<Long> differenceSet(List<Long> var, List<Long> val) {
        List<Long> longs = null;
        if (CollectionUtils.isNotEmpty(var) && CollectionUtils.isNotEmpty(val)) {
             longs = var.stream().filter(i -> val.contains(i)).collect(Collectors.toList());
        }
        return longs;
    }
}
