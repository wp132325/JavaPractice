package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"ºò¹ð", "2NE1", "°É½ºµ¥ÀÌ"};
		
		String[][] members = {
				{"GD", "ÅÂ¾ç", "´ë¼º", "Å¾", "½Â¸®"},
				{"CL", "»ê´Ù¶ó¹Ú", "¹Úº½", "¹ÎÁö"},
				{"À¯¶ó", "¼ÒÁø", "¹Î¾Æ", "Çý¸®"}
		};
		
		for(int i=0;i<3;i++) {
			System.out.println("<< " + idolGroup[i] + " ¸É¹ö>>");
			
			for(int j=0; j<4; j++) {
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
		
	}

}
