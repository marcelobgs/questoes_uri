package questoes_uri;

import java.util.Scanner;

public class questao1070 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int c = 0;

		while (c < 6) {
			if (a % 2 != 0) {
				System.out.println(a);
				c++;
			}
			a++;
		}

	}
}