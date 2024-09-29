package Lista4;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			System.out.println("Informe as palavras (separadas por ;): ");
			String text = entrada.nextLine();
			String[]vet=text.split(";");
			int len = vet.length;
			for (int i=0;i<len;i++) {
				System.out.print(vet[i] + " ");
			}
		entrada.close();
	}

}
