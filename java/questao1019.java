package questoes_uri;

import java.util.Scanner;

public class questao1019 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int atual = N;
		int horas = atual / 3600;
		atual = atual - horas * 3600;
		int min = atual / 60;
		atual = atual - min * 60;
		int sec = atual;
		
		System.out.printf("%d:%d:%d\n", horas, min, sec);
	}

}
