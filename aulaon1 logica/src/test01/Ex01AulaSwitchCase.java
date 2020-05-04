package test01;
import java.util.Scanner;	
public class Ex01AulaSwitchCase {
	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);
		char periodo;
		periodo = entrada.next().charAt(0);
		switch(periodo){
		case 'M':
			System.out.println("Bom Dia");
				break;
			
	   case 'V':
		System.out.println("Bom Tarde");
			break;
		
	    case 'N':
			System.out.println("Bom Noite");
				break;
			default:
				System.out.println("Periodo invalido:\n digite M ou V ou N");
			} 
		}
		
	}



