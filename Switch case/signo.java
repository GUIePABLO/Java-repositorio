import java.util.Scanner;
public class signo {
	public static void main(String args[]) {
		Scanner ler=new Scanner (System.in);
		int dia, mes;
	System.out.println("Inserir dia de aniversário:");	
	dia = ler.nextInt(); 
	System.out.println("Inserir mês de aniversário: ");
	mes = ler.nextInt(); 
	switch (mes) {
	case 1:
		if (dia<21)
		{ 
			System.out.println("Seu signo é: Capricornio" );
		} else {
			System.out.println("Segu signo è: Aquario");
		}
		break;
	case 2:
		if (dia<19)
		{
			System.out.println("Seu signo é: Aquario");
		} else {
			System.out.println("Seu signo é: Peixe");
		}
		break;
	case 3:
		if (dia<20)
		{
			System.out.println("Seu signo é: Peixe");
		} else {
			System.out.println("Seu signo é: Aries");
		}
		break;
	case 4:
		if (dia<21) 
		{
			System.out.println("Seu signo é: Aries");
		} else {
			System.out.println("Seu signo é: Touro");
		}
		break;
	case 5:
		if (dia<21)
		{
			System.out.println("Seu signo é: Touro");
		} else {
			System.out.println("Seu signo é: Gemeos");
		}
		break;
	case 6: 
		if (dia<21)
		{
		System.out.println("Seu signo é: Gemeos");	
		} else {
			System.out.println("Seu signo é: Cancer");
		}
		break;
	case 7:
		if (dia<23) 
		{
			System.out.println("Seu signo é: Cancer");
		} else {
			System.out.println("Seu signo é: Leão");
		}
		break;
	case 8: 
		if (dia<23)
		{
			System.out.println("Seu signo é: Leão");
		} else {
			System.out.println("Seu signo é: Virgem");
		}
		break;
	case 9: 
		if (dia<23)
		{
			System.out.println("Seu signo é: Virgem");
		} else {
			System.out.println("Seu signo é: Libra");
		}
		break;
	case 10:
		if (dia<24)
		{
			System.out.println("Seu signo é: Libra");
		} else {
			System.out.println("Seu signo é: Escorpião");
		}
		break;
	case 11: 
		if (dia<22)
		{
			System.out.println("Seu signo é: Escorpião");
		} else {
			System.out.println("Seu signo é: Sargitario");
		}
		break;
	case 12:
		if (dia<22)
		{
			System.out.println("Seu signo é: Sargitario");
		} else {
			System.out.println("Seu signo é: Capricornio");
		}
		break;
	default: System.out.println("Mês invalido, tente novamente!");
		
	}
	}
	
}
