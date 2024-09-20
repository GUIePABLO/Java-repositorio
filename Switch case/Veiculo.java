import java.util.Scanner;
public class Veiculo {
	public static void main(String[] args) {
		Scanner ler=new Scanner (System.in);
		int nume;
		System.out.println("Digite o ultimo numero da sua palca, para que eu possa ver o dia que ela pode andar");
		nume = ler.nextInt();
		switch (nume) {
		case 1:
		case 2:
			System.out.println("segunda-feira");
		break;
		case 3:
		case 4:
			System.out.println("terça-feira");
		break;
		case 5:
		case 6:
			System.out.println("quarta-feira");
		break;
		case 7:
		case 8:
			System.out.println("quinta-feira");
		break;
		case 9:
		case 0:
			System.out.println("sexta-feira");
		default:
			System.out.println("numero invarido, digite apenas um digite");
		}
		ler.close();
	}
}