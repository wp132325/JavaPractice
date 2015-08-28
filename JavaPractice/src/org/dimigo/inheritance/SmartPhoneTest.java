package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone[] phones = {
			new IPhone("iPhone 6", "애플", 700000),
			new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			
			phone.useSpecialFunction(phone);
			
			phone.turnOff();
			System.out.println();
		}

	}

}
