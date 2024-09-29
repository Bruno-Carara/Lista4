package Lista4;
import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		int[]vet = new int[21];
		int[]PAR = new int[21];
		int[]IMPAR = new int[21];
		Scanner entrada = new Scanner(System.in);
		for (int i=1;i<21;i++) {
			System.out.print("Digite o " + i + " valor: ");
			vet[i]=entrada.nextInt();
			if (vet[i]%2==0) {
				PAR[i]=vet[i];
			} else {
				IMPAR[i]=vet[i];
			}
		}
		System.out.print("Números: ");
		for (int i=1;i<=20;i++) {
		System.out.print(vet[i] + "/");
		}
		System.out.print("\nPares: ");
		for (int i=1;i<=20;i++) {
			if (PAR[i]>0) {
				System.out.print(PAR[i] + "/");
			}
		}
		System.out.print("\nImpares: ");
		for (int i=1;i<=20;i++) {
			if (IMPAR[i]>0) {
				System.out.print(IMPAR[i] + "/");
			}
		}
		entrada.close();
	}

}
