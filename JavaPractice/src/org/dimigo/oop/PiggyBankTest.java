package org.dimigo.oop;

public class PiggyBankTest { 
	public static void main(String[] args) { 
 		FamilyMember father = new FamilyMember("�ƺ�"); 
 		FamilyMember mother = new FamilyMember("����"); 
 		FamilyMember me = new FamilyMember("��"); 
		FamilyMember brother = new FamilyMember("������"); 
		 
		FamilyMember.printMemberCnt(); 
		 
		PiggyBank.putMoney(father, 10000); 
		PiggyBank.putMoney(mother, 5000); 
		PiggyBank.putMoney(me, 2000); 
		PiggyBank.putMoney(brother, 1000); 
		PiggyBank.putMoney(me, 1000); 
		PiggyBank.printBalance();
	} 
} 
