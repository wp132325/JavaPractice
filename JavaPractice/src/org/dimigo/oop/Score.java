package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 입력 : ");
		int kor = scanner.nextInt();
		
		System.out.println("수학점수 입력 : ");
		int math = scanner.nextInt();
		
		System.out.println("영어점수 입력 : ");
		int eng = scanner.nextInt();
		
		int a = kor + math + eng;
		double b = (kor + math + eng)/3;
		
		StringBuilder sb = new StringBuilder();
		sb.append("<<점수 출력>>\n").append("국어점수").append(kor).append("점\n")
		.append("수학점수").append(math).append("점\n")
		.append("영어점수").append(eng).append("점\n")
		.append("총점").append(a).append("점\n")
		.append("평균").append(String.format("%.1f", b)).append("점\n");
		
		System.out.println(sb);
		
	}

}
