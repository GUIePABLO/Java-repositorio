package igorEguilherme;
import java.util.Scanner;
public class Desconto {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		double produto, novap;
		System.out.println("Insira o preço do produto:");
		produto = ler.nextInt();
		novap = produto * 0.95; 
		System.out.println("O produto, após a aplicação do desconto, tem o valor: " + novap);
		ler.close();
	}
}
