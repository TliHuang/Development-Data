package com.icss.day06;

public class CompanyAccout {
    public static void main(String[] args) {
        boolean temp = true;
        int balance = 10000;
        String details = "收支  账户金额  收支金额  说明";
        do {
            System.out.println("*******公司简易记账系统*******");
            System.out.println("\t\t1-收支明细");
            System.out.println("\t\t2-登记收入");
            System.out.println("\t\t3-登记支出");
            System.out.println("\t\t4-退出");
            System.out.println("\t\t请选择（1-4）");
            System.out.println("****************************");
            char menu = Utility.readMenuSelection();
            switch (menu) {
                case '1':
                    System.out.print("*********收支明细记录*********\n\n");
                    System.out.println(details+"\n\n");
                    System.out.println("*****************************");
                    break;
                case '2':
                    System.out.println("***********登记收入**********");
                    System.out.print("请输入本次金额：");
                    int money = Utility.readNumber();
                    System.out.print("请输入本次说明：");
                    String des = Utility.readString();
                    balance += money;
                    details += "\n收入  " + balance + "    " + money + "     " + des;
                    System.out.println(details);
                    System.out.println("***********记账成功***********");
                    break;
                case '3':
                    System.out.println("***********登记支出**********");
                    System.out.print("请输入本次金额：");
                    int mon = Utility.readNumber();
                    System.out.print("请输入本次说明：");
                    String deos = Utility.readString();
                    balance -= mon;
                    details += "\n支出  " + balance + "    " + mon + "    " + deos;
                    System.out.println(details);
                    System.out.println("***********记账成功***********");
                    break;
                case '4':
                    System.out.print("确认是否退出（Y/N）：");
                    char confirm = Utility.readConfirmSelection();
                    if (confirm == 'Y') {
                        temp = false;
                    }
                    break;
            }
        } while (temp);
    }
}
