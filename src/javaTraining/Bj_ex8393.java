package javaTraining;
import java.util.Scanner;
//백준8393번 문제
public class Bj_ex8393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum=0;
			for(int i=1; i<=n; i++) {
				sum+=i;
			}
			System.out.println(sum);
			scanner.close();
		}

	}
