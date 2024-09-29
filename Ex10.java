package Lista4;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int c=0;
		int[]vetor=new int[3];
		do {
			System.out.println("Informe uma data (dd/mm/aaaa): ");
			String data = entrada.nextLine();
			String[]vet=data.split("/");
			vetor[0] = Integer.valueOf(vet[0]);
			vetor[1] = Integer.valueOf(vet[1]);
			vetor[2] = Integer.valueOf(vet[2]);
			if ((vetor[0]<0)||(vetor[1]<0)||(vetor[2]<0)){
				c=1;
			}
			if ((vetor[0]>31)||(vetor[1]>12)) {
				c=1;
			}
		} while(c==1);
		System.out.println("Dia: " + vetor[0]);
		System.out.println("Mês: " + vetor[1]);
		System.out.println("Ano: " + vetor[2]);
		entrada.close();
	}

}
