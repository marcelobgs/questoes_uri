package questoes_uri;

import java.util.Scanner;

public class questao1006 {
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		
		System.out.printf("MEDIA = %.1f\n", ((A*2)+(B*3)+ (C*5) )/10);

	}

}
