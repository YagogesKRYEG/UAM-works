package Aula23Março;
import java.util.Scanner;
public class parte01 {
	public static void main(String [] args) {
	 Scanner entrada = new Scanner(System.in);
	 	char tecla = 0;
	 	
	 System.out.println("Digite uma tecla ");
	 	tecla = entrada.next().charAt(0);
	 	
	 System.out.printf("a tecla pressionada vale %c",tecla);
 	}
}
