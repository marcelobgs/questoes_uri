package questoes_uri;

import java.util.Scanner;

public class questao1067 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
