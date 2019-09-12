package javaTraining;

import java.util.Scanner;

//백준1330번 문제
public class Backjoon_ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if(A>=-10000 && B<=10000) {
			if(A>B)
				System.out.println(">");
			else if(A<B)
				System.out.println("<");
			else
				System.out.println("==");
		}
		scanner.close();
	}
}
