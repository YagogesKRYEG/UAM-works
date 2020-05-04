package Atividadep05Maio;

import java.util.Scanner;

public class q7
{
	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
		 //meses: months
		 //ano atual:AtYear
		 //data de nascimento: birthdate
		 int months = 0;
		 int AtYear = 0;
		 int contador = 0;
		 int birthdate = 0;
		 String s;
		 System.out.println("Qual o seu nome? :");
		 s = entrada.nextLine();
		 
		 System.out.println(s   +   " Qual foi o ano de seu nascimento:" );
		 birthdate = entrada.nextInt();
		 
		 System.out.println( s   +   "  Qual ano estamos atualmente:" );
		 AtYear = entrada.nextInt();
		   
		 months= AtYear-birthdate;
		 months= months*12;
		    System.out.println("Você tem :"+months+" meses de vida, parabens");
	}
}