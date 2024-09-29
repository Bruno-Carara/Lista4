package Lista4;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual tamanho deseja?: ");
		int n = entrada.nextInt();
		int[]vetor=new int [n];
		for (int i=0;i<n;i++) {
			do {
				System.out.println("Qual valor deseja?(0-20): ");
				vetor[i]=entrada.nextInt();
				if ((vetor[i]<0)||(vetor[i]>20)){
					System.out.println("Valor inválido.");
				}
			} while ((vetor[i]<0)&&(vetor[i]>20));
		}
		for (int i=0;i<n;i++) {
			int k=0;
			System.out.print(vetor[i] + ": ");
			do {
				System.out.print("#");
				k++;
			} while (k<vetor[i]);
			System.out.println("");
		}
		entrada.close();

	}

}
