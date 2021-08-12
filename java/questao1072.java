package questoes_uri;

import java.util.Scanner;

public class questao1072 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int c = 0;
		int somaIn = 0;
		int somaOut = 0;

		while (c < N) {
			int X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				somaIn++;
			} else {
				somaOut++;
			}
			c++;
		}
		
		System.out.println (somaIn + " in");
		System.out.println(somaOut + " out");
	}

}
