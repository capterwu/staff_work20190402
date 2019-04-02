package ydb.auxiliary.service.ydbauxiliaryservice.dao.cluster;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;
import ydb.auxiliary.service.ydbauxiliaryservice.model.LibraryDto;
import ydb.auxiliary.service.ydbauxiliaryservice.model.OrderLibrary;
import ydb.auxiliary.service.ydbauxiliaryservice.model.OrderLibraryExample;

@Repository
public interface OrderLibraryMapper {
    long countByExample(OrderLibraryExample example);

    int deleteByExample(OrderLibraryExample example);

    int insert(OrderLibrary record);

    int insertSelective(OrderLibrary record);

    List<OrderLibrary> selectByExample(OrderLibraryExample example);

    int updateByExampleSelective(@Param("record") OrderLibrary record, @Param("example") OrderLibraryExample example);

    int updateByExample(@Param("record") OrderLibrary record, @Param("example") OrderLibraryExample example);

    @SelectProvider(type = OrderLibraryMapperProvider.class, method = "selectListByDate")
    List<LibraryDto> selectClusterOrder(Map<String, Object> map);


    @Select({
            "select a.ID as id from order_library a where a.ORDERTIME <NOW()" +
                    "and a.ORDERTIME>#{ordertime}"
    })
    List<Long> queryLia(@Param("ordertime") Date ordertime);


    class OrderLibraryMapperProvider {

        public String selectListByDate(Map<String, Object> map) {
            return new SQL() {
                {
                    SELECT("a.NICK_NAME AS nickName," +
                            " a.M_ID AS id," +
                            " a.BK_TIME as bkTime, " +
                            " a.ORDERTIME as ordertime, " +
                            " count(a.M_ID) as rentNum ");
                    FROM(" order_library a");
                    if (map.get("ordertime") != null) {
                        WHERE(" a.M_ID NOT IN ( SELECT M_ID FROM order_library WHERE ordertime < now( )" +
                                " AND ordertime > #{ordertime}" +
                                ")");
                    }
                    GROUP_BY(" a.M_ID");
                }
            }.toString();
        }


    }


}