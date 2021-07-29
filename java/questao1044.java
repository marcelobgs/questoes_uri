package questoes_uri;

import java.util.Scanner;

public class questao1044 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0)
			System.out.println("Sao Multiplos");
		else 
			System.out.println("Nao sao Multiplos");
	}
	

}
