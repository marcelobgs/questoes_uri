package questoes_uri;

import java.util.Scanner;

public class questao1014 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		
		System.out.printf("%.3f km/l\n", (X/Y));
		
	}

}
