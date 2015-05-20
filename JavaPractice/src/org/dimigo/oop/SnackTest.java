package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Snack[] snackArr = new Snack[] {
				new Snack("�����", "���", 1100, 2),
				new Snack("��Ĩ", "ũ���", 1200, 1),
				new Snack("��Ϲ���Ĩ", "����", 1500, 4)
		};
		
		int sum = 0;  
	  
		for(Snack snack : snackArr) {  
			snack.printSnack();  
			sum += snack.calcPrice();  
		}  
			  System.out.println("�� ���� �ݾ� : " + String.format("%,d", sum) + "��");  
			}  

		
	}