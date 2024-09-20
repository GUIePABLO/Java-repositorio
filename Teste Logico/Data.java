package igorEguilherme;
import java.util.Scanner;

public class Data {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int ano1, ano2, idade;
		System.out.println("Inserir seu ano de nascimento:");
		ano1 = ler.nextInt();
		System.out.println("Inserir ano atual:");
		ano2 = ler.nextInt();
		idade = (ano2 - ano1);
		System.out.println("Sua idade é: "+ idade);
		ler.close();
	}
}