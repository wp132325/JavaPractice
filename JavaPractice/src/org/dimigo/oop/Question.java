package org.dimigo.oop;

import java.util.Scanner;

public class Question {
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("가장 좋아하는 가수는?");
			String answer = scanner.nextLine();
			if("아이유".equals(answer)){
				System.out.println("정답입니다");
			} else {
				System.out.println("틀렸습니다");
			}
			
			System.out.println("가장 좋아하는 배우는?");
			answer = scanner.nextLine();
			if("박신혜".equals(answer)){
				System.out.println("정답입니다");
			} else {
				System.out.println("틀렸습니다");
			}
			
			System.out.println("가장 좋아하는 는 과목은?");
			answer = scanner.nextLine();
			if("자바".equals(answer)){
				System.out.println("정답입니다");
			} else {
				System.out.println("틀렸습니다");
			}
			
			
		}
}
