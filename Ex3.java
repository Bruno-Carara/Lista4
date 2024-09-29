package Lista4;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		int[]nota=new int[4];
		int media =0;
		Scanner entrada = new Scanner(System.in);
		for (int i=0;i<=3;i++) {
			System.out.print("Digite a nota: ");
			nota[i] = entrada.nextInt();
			media+=nota[i];
		}
		System.out.print("Notas: ");
		for (int i=0;i<=3;i++) {
			System.out.print(nota[i] + "/");
		}
		System.out.println("\nMédia: " + (float)media/4);
		entrada.close();
	}

}
