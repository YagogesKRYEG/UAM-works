package Aula23Março;

import java.util.Scanner;

public class parte01Opçao1 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		 	char tecla = 0;
		 	int numero = 0;
		 	
		 	System.out.println("Digite uma tecla:  \n");
		 	numero = entrada.next().charAt(0);
		 	
		 	System.out.printf("o numero digitado foi: %d",numero);
	 	}
	}
