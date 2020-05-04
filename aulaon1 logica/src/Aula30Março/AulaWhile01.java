package Aula30Março;
import java.util.Scanner;
public class AulaWhile01 {
	
	public static void main (String [] args){
		//while (condição verdadeira) (comando)
		Scanner entrada = new Scanner(System.in);
		int tecla = 0; 	//i=0;
		System.out.println("Digite uma tecla ");
	 	tecla = entrada.nextInt();
					//i = 0;
				while (tecla !=0); {	//0<10;
				System.out.printf("\n Digite mais uma vez:");
				tecla = entrada.nextInt();
		}
	}
}
