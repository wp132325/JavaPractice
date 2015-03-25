package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		
		int dis = 10, pay, addpay = 200;
		String car = "고속버스";
		int sum = 0;
		
		switch (car) { 
 		case "고속버스": 
 			pay = 850; 
 			addpay = 300; 
 			break; 
 		case "경차": 
 			pay = 300; 
 			break; 
 		default: 
 			pay = 600; 
 			break; 
 		} 
 		 
		int a = dis %10;
		
		if(a != 0){
			sum = (dis / 10);
		}
		else sum = (dis / 10) - 1;
		
		pay += addpay * sum;
		 
 		System.out.println("거리 : " + dis + "km"); 
 		System.out.println("차종 : " + car); 
 		System.out.println("통행료 : " + pay + "원"); 

 	} 
 } 
