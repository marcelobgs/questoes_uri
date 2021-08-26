package questoes_uri;

import java.text.DecimalFormat;

public class questao1098 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.0");
		float numI = 0, numJ = 1;

		while (numI <= 2.2) {
			for (int i = 0; i < 3; i++) {
				if(df.format(numI).endsWith("0")) {
					System.out.println("I="+ df.format(numI).substring(0,1) + " J=" + df.format(numJ).substring(0,1));
				}else {
					System.out.println("I=" + df.format(numI) + " J=" + df.format(numJ));
				}
				
				numJ++;
			}
			numJ-=3;
			numJ+=0.2;
			numI+=0.2;
		}

	}

}
