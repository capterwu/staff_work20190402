package ydb.auxiliary.service.ydbauxiliaryservice.dao.master;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;
import ydb.auxiliary.service.ydbauxiliaryservice.model.*;


@Repository
public interface MemberMapper {


    @Select({
            "<script>",
            "SELECT " +
                    " mem.ID as id," +
                    " mem.M_GROUP as mgroup, " +
                    " count(re.MID) as recodeNum, " +
                    " max(re.TRADING_TIME) as tradingtime ," +
                    " mem.ISBLOCK as isblock ," +
                    " mem.nick_name as nickName ," +
                    " mem.ISWITHDRAW as iswithdraw ," +
                    " mem.HEAD_IMG as headImg , " +
                    " mem.OPENID as openid ," +
                    " mem.REGISTTIME as registtime ," +
                    " wa.LAST_BALANCE as lastBalance " +
                    " FROM " +
                    " member mem " +
                    " INNER JOIN member_wallet wa ON mem.ID = wa.MID " +
                    " INNER JOIN member_recharge_record re ON mem.ID = re.MID  " +
                    " WHERE " +
                    " wa.LAST_BALANCE > 0  and " +
                    " mem.ID in    " +
                    "<foreach collection='libraryDtos' item='item' open='(' separator=',' close=')'>",
            "#{item.id}",
            "</foreach>",
            "GROUP BY " +
                    " re.MID",
            "</script>"

    })
    List<WalletDto> listWalletDto(@Param("libraryDtos") List<LibraryDto> libraryDtos);


    @Select({
            "SELECT " +
                    " a.ID AS id" +
                    " FROM " +
                    " member a " +
                    " LEFT JOIN member_wallet wa ON a.ID = wa.MID " +
                    " LEFT JOIN member_recharge_record re ON a.ID = re.MID " +
                    "WHERE " +
                    " wa.LAST_BALANCE > 0" +
                    " group by re.MID"
    })
    List<Long> select();

    @Select({
            "<script>",
            "select sum(los.lastBalance) from (",
            "SELECT " +
                    " mem.ID as id," +
                    " mem.M_GROUP as mgroup, " +
                    " count(re.MID) as recodeNum, " +
                    " max(re.TRADING_TIME) as tradingtime ," +
                    " mem.ISBLOCK as isblock ," +
                    " mem.ISWITHDRAW as iswithdraw ," +
                    " mem.HEAD_IMG as headImg , " +
                    " mem.OPENID as openid ," +
                    " mem.REGISTTIME as registtime ," +
                    " wa.LAST_BALANCE as lastBalance " +
                    " FROM " +
                    " member mem " +
                    " INNER JOIN member_wallet wa ON mem.ID = wa.MID " +
                    " INNER JOIN member_recharge_record re ON mem.ID = re.MID  " +
                    " WHERE " +
                    " wa.LAST_BALANCE > 0  and " +
                    " mem.ID in    " +
                    "<foreach collection='libraryDtos' item='item' open='(' separator=',' close=')'>",
            "#{item.id}",
            "</foreach>",
            "GROUP BY " +
                    " re.MID " +
                    " ) los",
            "</script>"
    })
    Long count(@Param("libraryDtos") List<LibraryDto> libraryDtos);


    /**
     * 查询出日志信息
     *
     * @param map
     * @return
     */
    @SelectProvider(type = MemberMapperProvider.class, method = "selectLog")
    List<LogVto> findLogs(Map<String, Object> map);


    //    @Update({
//            "<script>",
//            " update member_wallet",
//            " set current=0 ",
//            "where mid  in  (",
//            "<foreach collection='list' item='item' separator=',' close=')'>",
//            "#{item.id}",
//            "</foreach>",
//            "</script>"
//    })

    /**
     * 批量清零
     *
     * @param list
     * @return
     */
    @Update({
            "<script>",
            "<foreach collection='list' item='item' separator=';' >",
            "update member_wallet set ",
            " LAST_BALANCE=0 ",
            " where MID =#{item.id}",
            "</foreach>",
            "</script>"
    })
    int updateWalletByPrice(@Param("list") List<MemberVto> list);

    /**
     * 批量插入日志
     *
     * @param memberVtos
     * @param proVto
     * @param time
     * @param ip
     * @return
     */
    @Insert({
            "<script>",
            "insert into sys_memberwallet_pro (MEMBER, BEFORE_MON,PROCESS_TIME, OPERATOR_ID, REMARK,OPERATOR_IP, ACCOUNT_NAME, REAL_NAME)values",
            "<foreach collection='memberVtos' item='item' index='index' separator=','>",
            "(#{item.id}, #{item.lastBalance},#{time},#{proVto.id},#{item.remark},#{ip},#{proVto.accountName},#{proVto.realName})",
            "</foreach>",
            "</script>"
    })
    int saveWallLog(@Param("memberVtos") List<MemberVto> memberVtos, @Param("proVto") SysMember proVto, @Param("time") Date time, @Param("ip") String ip);


    /**
     * 查询出日志信息
     *
     * @param ids
     * @return
     */
    @Select({
            "<script>",
            "select mem.*,mem.BEFORE_MON as beforeMon from  sys_memberwallet_pro as mem inner join member as ber on mem.MEMBER=ber.ID",
            " where mem.ID in",
            "<foreach collection='ids' item='id' open='(' close=')' separator=','>",
            " #{id}",
            "</foreach>",
            "</script>"
    })
    List<SysMemberwalletPro> selectByIds(@Param("ids") List<Long> ids);


    @Update({
            "<script>",
            "<foreach collection='pros' separator=';' item='pros'> ",
            "update member_wallet set ",
            "LAST_BALANCE= LAST_BALANCE+ #{pros.beforeMon}",
            " where MID =#{pros.member}",
            "</foreach>",
            "</script>"
    })
    int restoreWalletList(@Param("pros") List<SysMemberwalletPro> pros);


    @Delete({
            "<script>",
            "delete from sys_memberwallet_pro where id in",
            "<foreach collection='pros' item='item' open='(' close=')' separator=','>",
            " #{item.id}",
            "</foreach>",
            "</script>"
    })
    int deleteWallectLogList(@Param("pros") List<SysMemberwalletPro> pros);


    /**
     * 查询客户id
     *
     * @param ids
     * @return
     */
    @Select({
            "<script>",
            "SELECT " +
                    " mem.ID AS id," +
                    " mem.OPENID AS openid," +
                    " wa.LAST_BALANCE AS lastBalance " +
                    " FROM " +
                    " member AS mem" +
                    " INNER JOIN member_wallet AS wa ON mem.ID = wa.MID " +
                    " WHERE  mem.ID in",
            "<foreach collection='ids' item='id' open='(' close=')' separator=','>",
            " #{id}",
            "</foreach>",
            "</script>",
    })
    List<MemberVto> findByIds(@Param("ids") List<Long> ids);


    class MemberMapperProvider {


        public String selectLog(Map<String, Object> map) {
            return new SQL() {
                {
                    SELECT("wa.id as id," +
                            " me.nick_name as nickName," +
                            " me.OPENID as openid," +
                            " me.HEAD_IMG as headImg," +
                            " wa.REMARK as remark ," +
                            " wa.PROCESS_TIME as processTime," +
                            " wa.OPERATOR_IP as operatorIp ," +
                            " sys.ACCOUNT_NAME as accountName, " +
                            " wa.BEFORE_MON as beforeMon ," +
                            " me.M_TYPE as mtype");
                    FROM(" sys_memberwallet_pro AS wa" +
                            " INNER JOIN MEMBER AS me ON wa.MEMBER = me.ID" +
                            " INNER JOIN sys_member AS sys ON wa.OPERATOR_ID = sys.ID ");
                    if (StringUtils.isNotEmpty((String) map.get("openid"))) {
                        WHERE(" me.OPENID=#{openid}");
                    }
                }
            }.toString();
        }

    }
}

