package ydb.auxiliary.service.ydbauxiliaryservice.util;

import com.netflix.discovery.converters.jackson.EurekaXmlJacksonCodec;
import org.apache.tomcat.util.descriptor.web.WebXml;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/14 12:54
 */
public class DateUtil {


    /**
     * 获取当前时间
     *
     * @param
     * @return
     */
    public static Date getDate(String days) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -Integer.valueOf(days));
        Date calendarTime = calendar.getTime();
        return calendarTime;
    }


}
