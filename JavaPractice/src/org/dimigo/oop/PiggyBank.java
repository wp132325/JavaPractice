package org.dimigo.oop;

public class PiggyBank {
	
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount)
	{
		System.out.println(member.getMemberName() + amount + "�� ����");
		balance += amount;
	}
	
	public static void printBalance()
	{
		System.out.println("���������� �� �ݾ� : " + balance + "��");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
