package org.dimigo.oop;

public class FamilyMember {
	
	private static int memberCnt = 0;
	
	private String memberName;
	
	public FamilyMember(String memberName)
	{
		this.memberName = memberName;
		this.memberCnt++;
	}
	
	public String getMemberName() 
	{
		return this.memberName;
	}

	public static void printMemberCnt()
	{
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}

}
