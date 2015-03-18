package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< 디미베네 연간 인건비 >>");
		
		long pay1 = 1700000;
		int staff = 3;
		int store = 1500;
		
		System.out.println("월 평균 급여 : " + String.format("%,d", pay1) + "원");
		System.out.println("점포 내 직원 수 : " + staff + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개");
		
		long pay2 = pay1 * 12 * staff * store;
		
		System.out.println();
		System.out.println();
		
		System.out.println("연간 인건비 : " + String.format("%,d", pay2) + "원");

	}

}
