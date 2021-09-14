package questoes_uri;

import java.util.Scanner;

public class questao1142 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N = sc.nextInt();
		for (int i = 1; i <= N * 4; i++) {
			if (i % 4 != 0)
				System.out.print(i + " ");
			else {
				System.out.println("PUM");
			}
		}

	}

}
