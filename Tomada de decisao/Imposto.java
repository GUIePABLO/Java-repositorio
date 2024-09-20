package ifelse;
import java.util.Scanner;
public class Imposto {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double sala, ir, parca, desconto;
	System.out.println("digite um salario");
	sala=ler.nextDouble();
	if(sala<=1434.59){
		ir=0;
		parca=0;
  }else if(sala<=2150){
	  ir=7.5;
	  parca=107.59;
  }else if(sala<=2866.70) {
	  ir=15;
	  parca=268.84;
  }else {
	  ir=27.5;
	  parca=662.94;
  }
	desconto=sala/100*ir-parca;
	System.out.println("seu desconto é" +desconto);
	ler.close();
}
}
