package Lista4;
import java.util.Scanner;
public class EX9 {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		System.out.print("Digite um texto: ");
		String texto = entrada.nextLine();

		char[] vetor = new char[texto.length()];


		for (int i = 0; i < texto.length(); i++) {
			vetor[i] = texto.charAt(i);
		}

		System.out.print("O vetor de caracteres é: ");
		for (char k : vetor) {
			System.out.print(k + "/");
		}

		entrada.close();
	}
}
