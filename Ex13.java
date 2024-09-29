package Lista4;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[]vet1 = new int[10];
		int[]vet2 = new int[10];
		int[]vet3 = new int[20];
	
		for (int i=0;i<10;i++) {
		vet1[i] = entrada.nextInt();
		}
		for (int i=0;i<10;i++) {
			vet2[i] = entrada.nextInt();
			}
		int k =0;
		for (int i=0;i<10;i++) {
			
				vet3[k++]=vet1[i];
				vet3[k++]=vet2[i];
		
		
		}
		for (int i=0;i<20;i++) {
			System.out.println(vet3[i]);
		}
		entrada.close();
	}
}
