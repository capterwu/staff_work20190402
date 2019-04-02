package com.speed.cat.service.ipml;

import com.speed.cat.dao.MemberMapper;
import com.speed.cat.model.Member;
import com.speed.cat.service.UserService;
import com.speed.cat.util.CatUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 描述:
 *
 * @author ganping
 * @create 2019/3/5 14:19
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {


    private static final String[] imgs = {"http://thirdwx.qlogo.cn/mmopen/6Gsz9DMImRGvy8sYOplgDUoByUf09BUzbGjOsK8FSVNxbWRgGiakKkXYKyyYbpxQVeCudNUjaCvvzYNIE7iagh8ZRyjOwhOlLK/132",
            "http://thirdwx.qlogo.cn/mmopen/qaGMrBzGtkzTBBf4dO8DxNzW7HjstODqzOFQ6svhJ1HusPO7nRTl7tliaXdz5mYib2GJfck10ZJ88j7aZAAxxfSXHMptHEMTpC/132",
            "http://thirdwx.qlogo.cn/mmopen/AgZ77SHkW3Rc9XWicVFiaUAyecRcPIaU6ZBvHJ4xDkWBQ2M8MLLHgMAGkmb2XWCANmdseDg4LcJFJurH2H1n5Xuz9ptLwkh3JG/132",
            "http://thirdwx.qlogo.cn/mmopen/Q3auHgzwzM7GsfVrO5gsoUGDhfUoBffrtLj8j1KtE79oMIcfsr388opXiawjVMIOxNUz9xUcJyMn5v84PmtskB1yF9z4KvKS8F59atBSW2nE/132",
            "http://thirdwx.qlogo.cn/mmopen/eCFSxpHFG143gOYRqX5wwCvd69BSYrOpyvU5Z3Q84GLpDsUNxTDTNSPschXC5Bic172RKuIMiaHeNyorWYia405DmCFICN5BXCT/132",
            "http://thirdwx.qlogo.cn/mmopen/xRm1Cx4Sk1d5jIWIlnMJKKbSuHXGdXKOZXvKJ00yaCyd0d9m7zmlh1ZNKJepGic2BbRxQThcV5QbfdvoIWV9g4WicYyfgL8oibL/132",
            "http://thirdwx.qlogo.cn/mmopen/xRm1Cx4Sk1dA5mDOPlYSXjYqjgRHVKzIM3OGIibTDFtfQjVkI19msOKoS2gic6DEkNS2dkhbg7MZsVPB5CexvF40zVo1gQgjZS/132",
            "http://thirdwx.qlogo.cn/mmopen/pV8Xz4A8vOPS8TKTcnsYHZPN9skAtQWsAR8ibibDDNfYVoOiamg7QW94Sjjd0libCdwAMmUl3ZsSBECPg47pla6RBZYibPbAd1ZSP/132",
            "http://thirdwx.qlogo.cn/mmopen/6Gsz9DMImREIAduk90swFPbTMs99nqNPr0EE4UIe5OCnCA4Ta0xHGy2sic1MLInW9NxtNCxj7aeOsaHEQn6T3h2xMOFj2iaOEr/132",
            "http://thirdwx.qlogo.cn/mmopen/6Gsz9DMImRH2Z9BbstWXVMSiaTboWfZ5GvDYCBO7RS3NW8SibIOT62XrlUMAEtqAOpxHbjXHbRDq8RJqjNiaKO50rBjZZVG0yts/132"};

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public int save(List<Member> members, Date s) {
        return memberMapper.save(members, s);
    }

    @Override
    public List<Member> getUUName(Date time) {
        List<Member> memberList = new ArrayList<Member>();
        Member member = null;
        for (int i = 1; i <= 30; i++) {
            member = new Member();
            member.setOpenid(CatUtil.generateUID());
            member.setNickName(CatUtil.getName());
            member.setHeadImg(CatUtil.randomImg(imgs));
            member.setmType(2);
            member.setmGroup(1);
            member.setIsreceive(1);
            member.setIswithdraw(2);
            member.setIsblock(2);
            member.setRegisttime(new Date());
            member.setSex(2);
            member.setOpenidMp(null);
            member.setUnionid(null);
            memberList.add(member);
        }
        return memberList;
    }

    @Override
    public List<Member> findAll(Date time) {
        return memberMapper.findAll(time);
    }

}
