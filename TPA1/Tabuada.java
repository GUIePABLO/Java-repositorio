import java.util.Scanner;
 
public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, b;
		System.out.println("Digite um numero: ");
		i = ler.nextInt();
		b = i;
		while (i< b*11) {
			System.out.println(i);
			i = i+b;
			ler.close();
		}
	}
 
}