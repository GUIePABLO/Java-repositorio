import java.util.Scanner;
public class Compra {
	public static void mais(String args []) {
		Scanner ler = new Scanner(System.in);
		double compra, porce;
		System.out.println("coloque o valor da sua compra");
		compra = ler.nextDouble();
		if(compra <= 100) {
			porce = (compra*5)/100;
		}else if(compra > 101 && compra <1000) {
			porce = (compra*8)/100;
		}else if(compra > 1001 && compra < 2000) {
			porce = (compra*10)/100;
		}else if(compra > 2001 && compra < 5000) {
			porce = (compra*12.5)/100;
		}else {
			porce = (compra*15)/100;
			System.out.println("o valor da sua compra foi de: " + compra);
			System.out.println("o seu cashback é de: " + porce);
		}
	}
}