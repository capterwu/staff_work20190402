package com.speed.cat.util;

import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 描述:
 *
 * @author ganping
 * @create 2019/3/5 10:10
 */
@Slf4j
public class CatUtil {


    private static final int[] arr = {1, 2, 3, 4, 5};

    /**
     * 随机
     *
     * @param arr
     * @return
     */
    public static int random(int[] arr) {
        int index = 0;
        if (arr.length > 0 && arr != null) {
            index = (int) (Math.random() * arr.length);
        }
        return arr[index];
    }

    public static String randomImg(String[] arr) {
        int index = 0;
        if (arr.length > 0 && arr != null) {
            index = (int) (Math.random() * arr.length);
        }
        return arr[index];
    }

    /**
     * 计算时间差
     *
     * @param startDte
     * @param endDate
     * @return
     */
    public static int dateMethod(Date startDte, Date endDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long mis = endDate.getTime() - startDte.getTime();
        log.info("相差的时长:" + mis);
        long minutes = mis / (1000 * 60);
        return (int) minutes;
    }

    /**
     * 计算价格
     *
     * @param x
     * @param y
     * @return
     */
    public static double getMultiply(double x, double y) {
        BigDecimal x1 = new BigDecimal(Double.valueOf(x));
        BigDecimal y1 = new BigDecimal(Double.valueOf(y));
        return x1.multiply(y1).setScale(2, BigDecimal.ROUND_FLOOR).doubleValue();
    }


    public static Date getfindDate(Date s) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(s);
        calendar.add(Calendar.MINUTE, -3);
        return calendar.getTime();
    }

    /**
     * 获取英文中文名字
     *
     * @return
     */
    public static synchronized String getName() {
        String name = null;
        int random = random(arr);
        if (random > 3) {
            name = getStringRandom(random);
        } else {
            name = getRandomJianHan(random);
        }
        return name;
    }

    /***
     * 生成uid 8位数字
     * 模仿支付宝
     */
    public static synchronized String generateUID() {
        String pre = "2088";
        return pre + createOrderId().substring(4, createOrderId().length());
    }


    /**
     * 计算分成
     *
     * @param price
     * @param arr
     * @return
     */
    public static double numberFormat(double price, Integer arr) {
        String a = arr.toString() + "%";
        Number n1 = null;
        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        try {
            n1 = numberFormat.parse(a);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return getMultiply(price, n1.doubleValue());
    }

    /**
     * 生成不重复的uuid
     *
     * @return
     */
    public static synchronized String createOrderId() {
        int machineId = 1;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数  
            hashCodeV = -hashCodeV;
        }
        return machineId + String.format("%015d", hashCodeV);

    }


    //生成随机用户名，数字和字母组成,
    public static String getStringRandom(int length) {
        String val = "";
        Random random = new Random();
        //参数length，表示生成几位随机数
        for (int i = 0; i < length; i++) {
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (random.nextInt(26) + temp);
            } else if ("num".equalsIgnoreCase(charOrNum)) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }

    /**
     * 生成中文
     *
     * @param len
     * @return
     */
    public static String getRandomJianHan(int len) {
        String ret = "";
        for (int i = 0; i < len; i++) {
            String str = null;
            int hightPos, lowPos; // 定义高低位
            Random random = new Random();
            hightPos = (176 + Math.abs(random.nextInt(39))); // 获取高位值
            lowPos = (161 + Math.abs(random.nextInt(93))); // 获取低位值
            byte[] b = new byte[2];
            b[0] = (new Integer(hightPos).byteValue());
            b[1] = (new Integer(lowPos).byteValue());
            try {
                str = new String(b, "GBK"); // 转成中文
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            ret += str;
        }
        return ret;
    }


    /**
     * 随机获取时间
     *
     * @param s
     * @return
     */
    public static synchronized Date getRandomDate(Date s) {
        int num = 0;
        int random = 0;
        Calendar instance = Calendar.getInstance();
        instance.setTime(s);
        random = (int) (Math.random() * 60 + 1);
        //随机生成多少分钟
        instance.add(Calendar.MINUTE, random);
        instance.add(Calendar.MILLISECOND, random);
        num = instance.get(Calendar.HOUR_OF_DAY) + random;
        if (num > 10) {
            instance.add(Calendar.HOUR_OF_DAY, 1);
        } else {
            random = 3;
            instance.add(Calendar.HOUR_OF_DAY, random);
        }
        return instance.getTime();
    }


    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(getRandomDate(new Date())));
        ;
    }


}
