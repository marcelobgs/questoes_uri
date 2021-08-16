package questoes_uri;

import java.util.Scanner;

public class questao1080 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int recebe = 0;
		int posicao = 1;
		for (int i = 1; i <= 100; i++) {
			int a = sc.nextInt();
			if (a > recebe) {
				recebe = a;
				posicao = i;
			}
			
		}
		System.out.println(recebe);
		System.out.println(posicao);
	}

}
