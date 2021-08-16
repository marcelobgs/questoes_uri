package questoes_uri;

import java.util.Scanner;

public class questao1075 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();

		for (int i = 1; i < 10000; i++) {
			if (i % N == 2) {
				System.out.println(i);
			}
		}
	}

}
