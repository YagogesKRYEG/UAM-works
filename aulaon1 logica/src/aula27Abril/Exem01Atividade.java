package aula27Abril;
import java.util.Scanner;
public class Exem01Atividade
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n1 =0;
		int n2 =0;
		do{
		System.out.println("Digite um número");
		n1 = entrada.nextInt();
		if(n2 <= n1){
		n2 = n1;
		}
		}while(n2 == n1);
	}
}

