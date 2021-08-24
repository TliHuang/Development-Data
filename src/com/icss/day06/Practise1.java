package com.icss.day06;
/**
 * 
 * 有一个数列：2/1,3/2,5/3,8/5,13/8 .... 求前20项之和 
 *  
 *  
 */


public class Practise1 {
	
	//i % j == 0 成立 j为i的因子
	
	public static void main(String[] args) {
		double  a = 2;//a分子
		double b = 1;//分母
		
		double sum = 0;
		double temp = 0;//临时变量
		
		
		for(int i = 1;i < 20;i++){
			sum = sum + a/b;
			
			 temp = a;
			 
			 a = a + b;
			 b = temp;
			 System.out.println( a+"/"+b );
		}
		System.out.println("----------");
		System.out.println(sum + 2/1);
		
		
	}
	

}
