package com.heima.javarumen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yuQ-7148
 * @date 2023/2/10
 **/
public class OperatorDemo2 {
    public static void main(String[] args) throws IOException {
        //需求：一个三位数，将其拆分为个位、十位、百位，输出在控制台
        //输入数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入三位数");
        String str = scan.nextLine();
        int data = Integer.parseInt(str);
        System.out.println("输入三位数为:" + data);
        //个位
        System.out.println("个位数为:" + data % 10);
        //十位
        System.out.println("十位数为:" + (data / 10) % 10);
        //百位
        System.out.println("百位数为:" + data / 100);
    }
}
