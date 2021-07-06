package questoes_uri;

import java.util.Scanner;

public class questao1013 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int maior = ((a + b + Math.abs(a-b))/2);
	int resu = ((maior + c + Math.abs(maior - c))/2);
	
	System.out.println( resu + " eh o maior");
	
	}

}
