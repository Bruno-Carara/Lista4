package Lista4;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		float[]vet = new float[11];
		Scanner entrada = new Scanner(System.in);
		for (int i=1;i<=10;i++) {
			System.out.print("Digite o " + i + " valor: ");
			vet[i]=entrada.nextFloat();
		}
		for (int i=10;i>=1;i--) {
			System.out.println(i + " valor: " + vet[i]);
		}
		
		entrada.close();
	}

}
