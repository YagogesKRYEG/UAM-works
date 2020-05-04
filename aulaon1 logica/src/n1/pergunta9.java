package n1;
import java.util.Scanner;
public class pergunta9 {
	public static void main (String [] args) {
		Scanner io= new Scanner(System.in);
		double contador=1;
		
		do{
			contador = contador + contador ;
			if (contador == 1024)
			{
				contador = contador - 24;
			}
			System.out.println(contador);
			{
				
			}
		}while (contador < 1000);
	}
}

               
