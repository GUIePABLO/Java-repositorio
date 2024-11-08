import java.util.*;
public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		double a[] = new double[15];
		double b[] = new double[15];
		
		
		//leitura de calcuro
		for(i=0; i<=14; i++) {
			System.out.println("porfavor insira o "+(i+1)+"° numero");
			a[i] = ler.nextInt();
		}
		
	}
}
