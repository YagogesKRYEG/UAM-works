package aula06Abril;
import java.util.Scanner;
public class Atividade02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		double acumulador= 0;
		double numero = 0;
		double media = 0;
		
		while (contador <= 5) {
			System.out.println("Digite um numero:");
			numero = entrada.nextDouble();
			acumulador = acumulador + numero;
			contador++;
			// com o if : if (numero >= 0)
		  //  {
		   //     contador = contador + 1;
		 //   }
			
				}
		media = acumulador / (contador);
		System.out.println("A media é: " + media);
		}
}
