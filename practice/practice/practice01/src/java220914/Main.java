package java220914;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int i = 1;
		while (i != n) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);
			i++;

		}

		/*
		 * for (int i = 0; i < n; i++) { int a = sc.nextInt(); int b = sc.nextInt();
		 * 
		 * System.out.println(a + b); }
		 */
		sc.close();

	}
}