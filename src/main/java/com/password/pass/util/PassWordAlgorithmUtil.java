package com.password.pass.util;

import java.util.*;

/**
 * 描述:
 * 算法模块
 * @author Red
 * @create 2019/3/28 15:02
 */
public class PassWordAlgorithmUtil {

    public static List list = new ArrayList<Integer>();

    public static void recursion(int num, int i) {
        //c初始密码
        int z = 0;
        z = (num * 343 + 17720) % 89567;
        // 对每个数对5取模
        String y = molding(String.valueOf(z));
        //替换
        String a = replace("44321", y);
        list.add(a);
        i++;
        if (i <= 20) {
            recursion(Integer.valueOf(a), i);
        }
    }

    /**
     * 替换
     * @param a
     * @param y
     * @return
     */
    public static String replace(String a, String y) {
        char[] as;
        char[] ys;
        //key 值不等于5 说明value值取模之后也是不等于5
        //则value 前面加上0
        if (y.length() != 5) {
            StringBuilder builder = new StringBuilder(y);
            builder.insert(0, 0);
            //前面加补位0
            ys = builder.toString().toCharArray();
        } else {
            ys = y.toCharArray();
        }
        as = a.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < ys.length; j++) {
            char temp;
            //如果是第0位是0 则为4
            if (ys[j] == '0') {
                if (j == 0) {
                    temp = '4';
                } else {
                    temp = as[j];
                }
            } else {
                temp = ys[j];
            }
            builder.append(String.valueOf(temp));
        }
        return builder.toString();
    }


    /**
     * 算出取模后的密码
     * @param z
     * @return
     */
    public static String molding(String z) {
        char[] array = z.toCharArray();
        StringBuffer builder = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            //算出最后的密码
            builder.append(Integer.valueOf(String.valueOf(array[i])) % 5);
        }
        //原有的A值  value 是取模过后的值
        return builder.toString();
    }





    public static void main(String[] args) {

        recursion(13244, 1);
        list.stream().forEach(System.out::println);

    }


}
