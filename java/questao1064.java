package questoes_uri;

import java.util.Scanner;

public class questao1064 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double a, media = 0;
		int som = 0;
		for (int i = 0; i < 6; i++) {
			a = sc.nextDouble();
			
			if (a > 0) {
				som++;
				media += a;
			}
		}
		System.out.println(som + " valores positivos");
		System.out.printf("%.1f\n", media / som);
	}

}
