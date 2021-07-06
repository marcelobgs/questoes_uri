package questoes_uri;

import java.util.Scanner;

public class questao1017 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int h = sc.nextInt();
		int km = sc.nextInt();
		
		double total = h * km / 12.0;
		
		System.out.printf("%.3f\n" ,total);
	}

}
