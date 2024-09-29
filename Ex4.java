package Lista4;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		char[]letra=new char[10];
		int cons=0;
		String consoantes = "";
		Scanner entrada = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			System.out.print("Digite um caractere: ");
			letra[i]=entrada.nextLine().toLowerCase().charAt(0);
			if ((letra[i]!='a') && (letra[i]!='e') && (letra[i]!='i') &&(letra[i]!='o') &&(letra[i]!='u')) {
				cons++;
				consoantes+=letra[i] + " ";
			}
		}
			System.out.println("Quantidade de Consoantes: " + cons);
			System.out.println("Consoantes lidas: " + consoantes);
		entrada.close();
	}

}
