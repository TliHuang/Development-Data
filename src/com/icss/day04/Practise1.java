package com.icss.day04;

import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        /**
         * 计算收入
         * 企业收入10万提成0.1
         * 企业收入20万提成前10万按0.1提成,10~20区间按0.075提成
         * 企业收入40万提成前20万按上述标准提成,20~40区间按0.05提成
         * 企业收入60万提成前40万按上述标准提成,40~60区间按0.03提成
         * 企业收入100万提成前60万按上述标准提成,60~100区间按0.015提成
         * 企业收入超过100万,前100万按上述标准提成,超过100万部分按0.01提成
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入提成前的收入金额：");
        double sr = sc.nextDouble();
        if (sr <= 10) {
            sr *= (1 + 0.1);
        } else if (sr <= 20) {
            sr = 10 * (1 + 0.1) + (sr - 10) * (1 + 0.075);
        } else if (sr <= 40) {
            sr = 10 * (2 + 0.1 + 0.075) + (sr - 20) * (1 + 0.05);
        } else if (sr <= 60) {
            sr = 10 * (5 + 0.1 + 0.075) + (sr - 40) * (1 + 0.03);
        } else if (sr <= 100) {
            sr = 10 * (7.6+ 0.1 + 0.075) + (sr - 60) * (1 + 0.015);
        } else {
            sr = 10 * (11.66+ 0.1 + 0.075) + (sr - 100) * (1 + 0.01);
        }
        System.out.println("提成后的收入金额为：" + sr+"万元");
    }
}
