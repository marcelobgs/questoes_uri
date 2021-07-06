package questoes_uri;

import java.util.Scanner;

public class questao1020 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int idade = sc.nextInt();
		int anos = idade / 365;
		idade = idade - anos * 365;
		int meses = idade / 30;
		idade = idade - meses * 30;
		int dias = idade;
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");

	}

}
