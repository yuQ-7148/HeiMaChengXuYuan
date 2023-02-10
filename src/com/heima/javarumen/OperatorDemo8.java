package com.heima.javarumen;

/**
 * @author yuQ-7148
 * @date 2023/2/10
 **/
public class OperatorDemo8 {
    public static void main(String[] args) {
        //三元运算符
        double score = 98;
        String rt = score >= 60 ? "通过" : "不通过";
        System.out.println(rt);

        System.out.println("-------------------------------");

        //三个数求最大值
        int i = 10;
        int j = 30;
        int k = 50;
        int temp = i > j ? i : j;
        int rtMax = temp > k ? temp : k;
        System.out.println(rtMax);

        System.out.println("-------------------------------");

        rtMax = i > k ? i > j ? i : j : j > k ? j : k;
        System.out.println(rtMax);
    }
}
