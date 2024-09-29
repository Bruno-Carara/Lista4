package Lista4;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float[]nota=new float[11];
		int geral=0;
		for (int al=1;al<=10;al++) {
		System.out.print("Digite a primeira nota do " + al + " aluno: ");
		nota[al]+=entrada.nextFloat();
		}
		for (int al=1;al<=10;al++) {
			System.out.print("Digite a segunda nota do " + al + " aluno: ");
			nota[al]+=entrada.nextFloat();
			}
		for (int al=1;al<=10;al++) {
			System.out.print("Digite a terceira nota do " + al + " aluno: ");
			nota[al]+=entrada.nextFloat();
			}
		for (int al=1;al<=10;al++) {
			System.out.print("Digite a quarta nota do " + al + " aluno: ");
			nota[al]+=entrada.nextFloat();
			}
		for (int al=1;al<=10;al++) {
			if ((nota[al]/4)>=7) {
				geral++;
			}
		}
		System.out.println(geral + " alunos com média igual ou maior que 7");
		entrada.close();
	}

}
