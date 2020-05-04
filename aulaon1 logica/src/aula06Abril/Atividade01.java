package aula06Abril;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero = 0;
		double soma = 0;
		while (numero >= 0) {
			soma = soma + numero;
			System.out.printf("Digite o numero a ser somado \n");
			numero = entrada.nextDouble();
		}
		System.out.printf("a soma dos valores é igual à: %f", soma);
	}
}
