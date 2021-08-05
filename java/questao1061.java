package questoes_uri;

import java.util.Scanner;

public class questao1061 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int diasTotal = 0;
		int horasTotal = 0;
		int minsTotal = 0;
		int secsTotal = 0;

		String[] sDiaInicial = sc.nextLine().split(" ");
		String[] sHoraInicial = sc.nextLine().split(" : ");
		String[] sDiaFinal = sc.nextLine().split(" ");
		String[] sHoraFinal = sc.nextLine().split(" : ");

		int diaInicial = Integer.parseInt(sDiaInicial[1]);
		int horaInicial = Integer.parseInt(sHoraInicial[0]);
		int minInicial = Integer.parseInt(sHoraInicial[1]);
		int secInicial = Integer.parseInt(sHoraInicial[2]);
		int diaFinal = Integer.parseInt(sDiaFinal[1]);
		int horaFinal = Integer.parseInt(sHoraFinal[0]);
		int minFinal = Integer.parseInt(sHoraFinal[1]);
		int secFinal = Integer.parseInt(sHoraFinal[2]);

		if (secFinal < secInicial) {
			secsTotal = secsTotal + (60 - secInicial) + secFinal;
			minsTotal--;
		} else if (secFinal > secInicial) {
			secsTotal = secsTotal + secFinal - secInicial;
		} else {
			secsTotal = 0;
		}

		if (minFinal < minInicial) {
			minsTotal += (60 - minInicial) + minFinal;
			horasTotal--;
		} else if (minFinal > minInicial) {
			minsTotal += minFinal - minInicial;
		} else {
			minsTotal = 0;
		}

		if (horaFinal < horaInicial) {
			horasTotal += (24 - horaInicial) + horaFinal;
			diasTotal--;
		} else if (horaFinal > horaInicial) {
			horasTotal += horaFinal - horaInicial;
		} else {
			horasTotal = 0;
		}

		if (diaFinal < diaInicial) {
			diasTotal += (30 - diaInicial) + diaFinal;
		} else if (diaFinal > diaInicial) {
			diasTotal += diaFinal - diaInicial;
		} else {
			diasTotal = 0;
		}

		System.out.println(diasTotal + " dia(s)");
		System.out.println(horasTotal + " hora(s)");
		System.out.println(minsTotal + " minuto(s)");
		System.out.println(secsTotal + " segundo(s)");

	}

}
