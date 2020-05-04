package Atividadep05Maio;
import java.util.Scanner;

public class q4 {
	 public static void main(String args[])  {
	Scanner entrada = new Scanner (System.in);
		int prime;
		//prime é primo
		System.out.println("Este programa é dedicado para calculo de numeros primos");
		System.out.println("\n  Numero para fazer o calculo:");
		prime= entrada.nextInt();
		if (prime % 2 != 0 & prime % 3 !=0) {
			System.out.println("\n Este Numero:"+ prime +" é primo");
		}else if(prime == 2 ^ prime == 3) {
			System.out.println("\n  Este Numero:"+ prime +" é primo ");
		 }else if(prime == 0) {
			 System.out.println("\n  Favor inserir numero maior que 0!");
		 }else if(prime == 1) {
			 System.out.println("\n  Este Numero:"+ prime +" não é primo");			  
		 }else {
			 System.out.println("\n  Este Numero:"+ prime +" não é primo");			  			 
		 }
	 }
}


