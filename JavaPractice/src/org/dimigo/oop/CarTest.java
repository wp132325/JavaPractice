/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	|_ CarTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author		: JS
 * @version		: 1.0
 */
public class CarTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//car1
		
		/*Car GENESIS = new Car();
		Car K7 = new Car();
		Car SM7 = new Car();
		
		GENESIS.setCompany("현대자동차");
		GENESIS.setModel("제네시스");
		GENESIS.setColor("검정색");
		GENESIS.setMaxSpeed(225);
		GENESIS.setPrice(50000000);
		
		K7.setCompany("기아자동차");
		K7.setModel("K7");
		K7.setColor("흰색");
		K7.setMaxSpeed(236);
		K7.setPrice(40000000);
		
		SM7.setCompany("삼성자동차");
		SM7.setModel("SM7");
		SM7.setColor("회색");
		SM7.setMaxSpeed(200);
		SM7.setPrice(38000000);
		*/
		
		/*
		Car2 GENESIS = new Car2("현대자동차", "제네시스", "검정색", 255, 50000000);
		Car2 K7 = new Car2("기아자동차", "K7", "흰색", 236, 40000000);
		Car2 SM7 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		*/
		
		Car3 GENESIS = new Car3("현대자동차", "제네시스", "검정색", 255, 50000000);
		Car3 K7 = new Car3("기아자동차", "K7", "흰색", 236);
		Car3 SM7 = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("<<자동차 목록>>");
		
		System.out.println("제조사명 : " + GENESIS.getCompany());
		System.out.println("모델명 : " + GENESIS.getModel());
		System.out.println("색상 : " + GENESIS.getColor());
		System.out.println("최대속도 : " + GENESIS.getMaxSpeed() + "Km");
		System.out.println("가격 : " + String.format("%,d", GENESIS.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + K7.getCompany());
		System.out.println("모델명 : " + K7.getModel());
		System.out.println("색상 : " + K7.getColor());
		System.out.println("최대속도 : " + K7.getMaxSpeed() + "Km");
		System.out.println("가격 : " + String.format("%,d", K7.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + SM7.getCompany());
		System.out.println("모델명 : " + SM7.getModel());
		System.out.println("색상 : " + SM7.getColor());
		System.out.println("최대속도 : " + SM7.getMaxSpeed() + "Km");
		System.out.println("가격 : " + String.format("%,d", SM7.getPrice()) + "원");
		System.out.println();
		
	}

}
