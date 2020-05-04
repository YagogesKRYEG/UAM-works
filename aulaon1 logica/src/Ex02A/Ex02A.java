package Ex02A;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02A {

	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	
	 System.out.print("Digite o codigo do produto");
	 int codigo;
	 codigo = entrada.nextInt();
	 
	 System.out.println("Quantas Unidades vc quer comprar?");
	 int quantidade;
	 quantidade = entrada.nextInt();
	 
	 
	 System.out.println("codigo:" + codigo);
	 
	 System.out.println("quantidade:" + quantidade);
	 
	 double valor = 0;
	 
	 DecimalFormat formatador = new DecimalFormat("0.00");
	 
	 String nome = "";
	 
	 if(codigo == 100) {
		 valor = quantidade * 1.2;
		 nome = "dogão";
	 }
	 if(codigo == 101) {
		 valor = quantidade * 1.3;
	 nome = "bauru normal";
	 }
	 if(codigo == 102) {
		 valor = quantidade * 1.4;
		 nome = "Bauru com ovo";
	 } 
	 if(codigo == 103) {
		 valor = quantidade * 1.5;
		 nome = "Hamburguer";
	 } 
	 if(codigo == 104) {
		 valor = quantidade * 1.6;
		 nome = "cheeseburguer";
	 }
	 if(codigo == 105) {
		 valor = quantidade * 1.7;
		 nome = "Refrigerante";
	 }
	 System.out.println("O produto é:" + nome);
	 System.out.println("O valor do produto é:" + valor);
	}
}
