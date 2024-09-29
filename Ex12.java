package Lista4;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[]idade = new int [5];
		float[]peso = new float [5];
		int maisvelho=0,maisnovo=0;
		float maispesado=0,maisleve=0,mediapeso=0,mediaidade=0;
		for (int i=0;i<5;i++) {
			System.out.print("Digite a idade da " + (i+1) + " pessoa: ");
			idade[i] = entrada.nextInt();
			System.out.print("Digite o peso da " + (i+1) + " pessoa: ");
			peso[i] = entrada.nextFloat();
			if (i==0) {
				maisvelho = idade[i];
				maisnovo = idade[i];
				maispesado = peso[i];
				maisleve = peso[i];
			} else if(maisvelho<idade[i]) {
				maisvelho=idade[i];
			} else if (maisnovo>idade[i]) {
				maisnovo=idade[i];
			}
			if (maispesado<peso[i]) {
				maispesado=peso[i];
			} else if (maisleve>peso[i]) {
				maisleve=peso[i];
			}
			mediaidade+=idade[i];
			mediapeso+=peso[i];
		}
		mediaidade=mediaidade/5;
		mediapeso=mediapeso/5;
		System.out.print("Idades: ");
		for (int i=4;i>=0;i--) {
			System.out.println(idade[i]);
		}
		for (int i=0;i<5;i++) {
			if (idade[i]>mediaidade) {
				System.out.println(idade[i] + " acima da média.");
			} else {
				System.out.println(idade[i] + " abaixo da média.");
			}
		}
		System.out.print("Pesos: ");
		for (int i=4;i>=0;i--) {
			System.out.println(peso[i]);
		}
		for (int i=0;i<5;i++) {
			if (peso[i]>mediapeso) {
				System.out.println(peso[i] + " acima da média.");
			} else {
				System.out.println(peso[i] + " abaixo da média.");
			}
		}
		System.out.println("Mais Velho: " + maisvelho + "\nMais Novo: " + maisnovo + "\nMais Pesado: " + maispesado + "\nMais Leve: " + maisleve);

		entrada.close();
	}

}
