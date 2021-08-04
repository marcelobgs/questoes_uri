package questoes_uri;

import java.util.Scanner;

public class questao1060 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double a;
		int som = 0;
		for (int i = 0; i < 6; i++) {
			a = sc.nextDouble();
			if (a > 0) {
				som++;
			}
		}
		System.out.println(som + " valores positivos");
	}

}
