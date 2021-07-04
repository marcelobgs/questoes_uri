package questoes_uri;

import java.util.Scanner;

public class questao1005 {
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		
		System.out.printf("MEDIA = %.5f\n", ((A*3.5)+(B*7.5))/11);

	}

}
