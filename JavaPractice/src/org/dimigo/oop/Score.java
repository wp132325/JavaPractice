package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������� �Է� : ");
		int kor = scanner.nextInt();
		
		System.out.println("�������� �Է� : ");
		int math = scanner.nextInt();
		
		System.out.println("�������� �Է� : ");
		int eng = scanner.nextInt();
		
		int a = kor + math + eng;
		double b = (kor + math + eng)/3;
		
		StringBuilder sb = new StringBuilder();
		sb.append("<<���� ���>>\n").append("��������").append(kor).append("��\n")
		.append("��������").append(math).append("��\n")
		.append("��������").append(eng).append("��\n")
		.append("����").append(a).append("��\n")
		.append("���").append(String.format("%.1f", b)).append("��\n");
		
		System.out.println(sb);
		
	}

}
