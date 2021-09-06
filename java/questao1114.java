package questoes_uri;

import java.util.Scanner;

public class questao1114 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int senha = 2002;
		int tentativa = sc.nextInt();
		while(tentativa != senha) {
			System.out.println("Senha Invalida");
			tentativa = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
	}

}
