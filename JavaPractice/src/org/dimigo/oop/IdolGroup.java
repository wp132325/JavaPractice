package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"���", "2NE1", "�ɽ�����"};
		
		String[][] members = {
				{"GD", "�¾�", "�뼺", "ž", "�¸�"},
				{"CL", "��ٶ��", "�ں�", "����"},
				{"����", "����", "�ξ�", "����"}
		};
		
		for(int i=0;i<3;i++) {
			System.out.println("<< " + idolGroup[i] + " �ɹ�>>");
			
			for(int j=0; j<4; j++) {
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
		
	}

}
