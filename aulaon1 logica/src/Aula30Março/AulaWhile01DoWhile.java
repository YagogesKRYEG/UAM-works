package Aula30Março;
import java.util.Scanner;
public class AulaWhile01DoWhile {
	public static void main (String [] args){
		// do (comando) while (condição)
		Scanner entrada = new Scanner(System.in);
		int tecla = 0;
		int i =0;
			do{
				System.out.printf("digite de 0 a 10");
				tecla = entrada.nextInt();
				System.out.printf("você digitou:%d %f \n");
				
	    }			while(tecla !=0);		//10<10?
	}
}