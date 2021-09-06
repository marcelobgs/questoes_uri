package questoes_uri;

import java.util.Scanner;

public class questao1131 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int g, i, aux = 1, contG = 0, contI = 0, contE = 0, total = 0;
		while (aux == 1) {
			total++;
			i = sc.nextInt();
			g = sc.nextInt();
			if (i > g) {
				contI++;
			} else if (i < g) {
				contG++;
			} else  {
				contE++;
			}
	
			System.out.println("Novo grenal (1-sim 2-nao)");
			aux = sc.nextInt();
		}
		System.out.println(total+" grenais");
		System.out.println("Inter:"+contI);
		System.out.println("Gremio:"+contG);
		System.out.println("Empates:"+contE);
		if(contI>contG) {
			System.out.println("Inter venceu mais");
		}else if(contI<contG) {
			System.out.println("Gremio venceu mais");
		}else  {
			System.out.println("Nao houve vencedor");
		}
	}

}
