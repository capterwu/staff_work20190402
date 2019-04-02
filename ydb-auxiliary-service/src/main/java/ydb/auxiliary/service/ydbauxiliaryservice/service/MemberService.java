package ydb.auxiliary.service.ydbauxiliaryservice.service;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/11 17:27
 */
public interface MemberService {


    HashMap<String, Object> querryList(Map<String, Object> maps, Integer pageNum, Integer pageSize) throws Exception;


    HashMap<String, Object> findLog(Map<String, Object> map, Integer pageNum, Integer pageSize) throws Exception;

    /**
     * @return
     * @throws Exception
     */
    HashMap<String, Object> walletClear(String ids, HttpServletRequest request, Long id) throws Exception;

    /**
     * 批量恢复
     *
     * @param openIds
     * @return
     * @throws Exception
     */
    HashMap<String, Object> walletRestoreList(String openIds, HttpServletRequest request, Long id) throws Exception;


    HashMap<String, Object> verificationParameter(String days) throws Exception;





}
