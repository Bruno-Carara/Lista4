package Lista4;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		int[]vet = new int[6];
		Scanner entrada = new Scanner(System.in);
		for (int i=1;i<=5;i++) {
			System.out.print("Digite o " + i + " valor: ");
			vet[i]=entrada.nextInt();
		}
		for (int i=1;i<=5;i++) {
			System.out.println(i + " valor: " + vet[i]);
		}
		
		entrada.close();
	}

}
