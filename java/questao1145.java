package questoes_uri;

import java.util.Scanner;

public class questao1145 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int X = sc.nextInt();
		int Y = sc.nextInt();

		for (int i = 1; i <= Y; i++) {
			System.out.print(i);
			if (i % X == 0)
				System.out.println("");
			else
				System.out.print(" ");
		}

	}

}
