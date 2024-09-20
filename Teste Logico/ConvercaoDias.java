package igorEguilherme;
import java.util.Scanner;
	public class ConvercaoDias {
		public static void main (String args []) {
			Scanner ler = new Scanner (System.in);
			int dia, mes, ano;
			System.out.println("Inserir quantidade de dias: ");
			dia = ler.nextInt();
			mes = dia / 30;
			ano = dia / 365;
			System.out.println("São " + mes + " Meses ou " + ano + " Anos");
	
}
}
