package questoes_uri;

import java.util.Scanner;

public class questao1078 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println( i + " x " + N + " = " + i * N);
		}

	}

}
