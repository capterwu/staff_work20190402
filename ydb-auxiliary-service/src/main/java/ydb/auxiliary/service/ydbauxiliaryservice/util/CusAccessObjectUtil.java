package ydb.auxiliary.service.ydbauxiliaryservice.util;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 描述:
 *
 * @author Red
 * @create 2019/3/14 11:45
 */
public class CusAccessObjectUtil {

    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 计算价格
     *
     * @param x
     * @param y
     * @return
     */
    public static double getAdd(double x, double y) {
        BigDecimal x1 = new BigDecimal(Double.valueOf(x));
        BigDecimal y1 = new BigDecimal(Double.valueOf(y));
        return x1.add(y1).doubleValue();
    }


    static class model {

        int code;
        String name;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public model(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }

    static class var {
        int code;
        String msg;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }

        public var(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }


    static class  los{

        int code;
        String msg;
        String name;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public los(int code, String msg, String name) {
            this.code = code;
            this.msg = msg;
            this.name = name;
        }
    }


    public static void main(String[] args) {


        new model(1, "haha");

        List<model> var = Arrays.asList(new model(1, "haha"), new model(2, ""), new model(3, ""));
        List<var> aa = Arrays.asList(new var(2, "haaaaa"), new var(3, "klk"));

        List<String> integers = new ArrayList<String>();
        integers.add("2");
        integers.add("3");
        integers.add("5");
        integers.add("6");
        integers.add("7");
        List<String> integ = new ArrayList<String>();
        integ.add("2");
        integ.add("9");
//        List<String> a = integers.stream().filter(i -> !integ.contains(i)).collect(Collectors.toList());
//        a.parallelStream().forEach(System.out::println);

    }


}
