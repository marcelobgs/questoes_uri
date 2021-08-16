package questoes_uri;

import java.util.Scanner;

public class questao1074 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (a == 0) {
				System.out.println("NULL");
			} else if (a > 0 && a % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			} else if (a > 0 && a % 2 != 0) {
				System.out.println("ODD POSITIVE");
			} else if (a < 0 && a % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (a < 0 && a % 2 != 0) {
				System.out.println("ODD NEGATIVE");
			}
		}

	}

}
