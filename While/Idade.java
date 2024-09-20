import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int i, ano, naci, idade;
		i=0;
		while(i<7) {
			System.out.println("insira o ano atual");
			ano = Ler.nextInt();
			System.out.println("insira o ano de nacimento");
			naci = Ler.nextInt();
			idade = ano - naci;
			if(idade<18) {
				System.out.println("Menor de idade!");
			}else {
				System.out.println("Maior de idade!");
			}i = i+1;
		}
	}
}
