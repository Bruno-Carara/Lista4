package Lista4;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		int[]vet = new int[5];
		int soma =0, mult=1;
		Scanner entrada = new Scanner(System.in);
		for (int i=0;i<=4;i++) {
			System.out.print("Digite um número: ");
			vet[i]=entrada.nextInt();
			soma+=vet[i];
			mult=mult*vet[i];
			}
		System.out.print("Números: ");
		for (int i=0;i<=4;i++) {
			System.out.print(vet[i] + "/");
		}
		System.out.println("\nA soma dos números é: " + soma + "\nA multiplicação dos números é: " + mult);
		entrada.close();
	}

}
