package org.dimigo.oop;

import java.util.Scanner;

public class Question {
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("���� �����ϴ� ������?");
			String answer = scanner.nextLine();
			if("������".equals(answer)){
				System.out.println("�����Դϴ�");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}
			
			System.out.println("���� �����ϴ� ����?");
			answer = scanner.nextLine();
			if("�ڽ���".equals(answer)){
				System.out.println("�����Դϴ�");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}
			
			System.out.println("���� �����ϴ� �� ������?");
			answer = scanner.nextLine();
			if("�ڹ�".equals(answer)){
				System.out.println("�����Դϴ�");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}
			
			
		}
}
