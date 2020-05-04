package test01;
import java.util.Scanner;
public class Ex01AulaIF {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("teste");
		System.out.println("Digite o periodo em que vc estuda");
		char periodo;
		periodo = input.next().charAt(0);
		System.out.println("" + periodo);
		
		if(periodo == 'M' || periodo == 'm') {
			System.out.println("Bom Dia");
		}if(periodo == 'V'|| periodo == 'v'){
			System.out.println("Boa Tarde");
		}if(periodo == 'D'|| periodo == 'd');{
			System.out.println("Bom Noite");
			
		}
		
	}

}
