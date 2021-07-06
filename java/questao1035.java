package questoes_uri;

import java.util.Scanner;

public class questao1035 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		if(B>C && D>A && C + D > A + B && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}
		else 
			System.out.println("Valores nao aceitos");
	}

}
