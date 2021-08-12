package questoes_uri;

import java.util.Scanner;

public class questao1073 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N = sc.nextInt();

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "^2 = " + i * i);
			}
		}
	}

}
