package questoes_uri;

import java.util.Scanner;

public class questao1015 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		System.out.printf("%.4f\n", Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1,2)));
	}

}
