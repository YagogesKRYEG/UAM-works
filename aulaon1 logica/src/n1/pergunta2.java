package n1;
import java.util.Scanner;
public class pergunta2 {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
        
        int sm = 0; 
        int i;
        int cont = 1;
        
        while(cont < 100){
            
            System.out.println("\nDigite um valor: ");
            i = entrada.nextInt();
            
            sm = i + sm;
            
            if (sm >= 100){
            
            System.out.println("O resultado é:"+sm);    
                
            }
        cont = sm;    
        	}
        }

	}


