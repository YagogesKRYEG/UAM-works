package aula06Abril;
import java.util.Scanner;
public class Atividade03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 1;
		int n2 = 1;
		int n3 = 0;
		int contador = 0;
		n3 = n1+ n2;
		while (n3 < 1000) 
		{
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			contador++;
			System.out.println("o elemento" +n3);
		}
	}
}
