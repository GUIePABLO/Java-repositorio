import java.util.Scanner;
public class futboll {
	public static void main(String args[]) {
		Scanner ler=new Scanner (System.in);
		int num;
		System.out.println("insira um numero : ");
		num = ler.nextInt();
		switch(num) {
		case 6:
			System.out.println("Dente de leite");
		break;
		case 7:
			System.out.println("Junior");
		break;
		case 8:
			System.out.println("Junior Max");
		break;
		case 9:
			System.out.println("Junior Master");
		break;
		case 10:
			System.out.println("Master");
		break;
		default:
			System.out.println("numero invalido");
		}
  }
}

