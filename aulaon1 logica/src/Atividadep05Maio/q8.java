package Atividadep05Maio;

import java.util.Scanner;

public class q8{
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0; 
		int mtpr = 0;

		System.out.print("Por Favor digite o número para saber quais são seus repectivos múltiplos: ");
		n1 = entrada.nextInt();

		System.out.println("Por Favor digite o número limite:");
		n2 = entrada.nextInt();

		for (int i = 0; i <= n2; i++) {
			mtpr = n1 * i;
			System.out.println(n1 + " x " + i + " = " + mtpr);
		}
		entrada.close();
	}
}