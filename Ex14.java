package Lista4;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float media=0;
		int[]idade = new int[30];
		float[]altura = new float[30];
		int total = 0;
		for (int i=0;i<30;i++) {
			idade[i]=entrada.nextInt();
			altura[i]=entrada.nextFloat();
			media+=altura[i];
		}
		media=(float)media/30;
		for (int i=0;i<30;i++) {
			if ((idade[i]>13)&&(altura[i]<media)) {
				total++;
			}
		}
		System.out.println("Total de alunos maiores de 13 anos e inferiores entre a média de alturas: " + total);
		entrada.close();
	}

}
