package questoes_uri;

import java.util.Scanner;

public class questao1007 {
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		System.out.println("DIFERENCA = " + (A * B - C * D));
	}

}
