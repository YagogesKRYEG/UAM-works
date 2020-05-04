package aula27Abril;
import java.util.Scanner;
public class Exem03Atividade {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int alternativa = 0;
		double area = 0;
		double base = 0;
		double altura = 0;
		double lado = 0;
		double raio = 0;
		double bmaior = 0;
		double bmenor = 0;
		double resultado = 0;
		System.out.println("Escolha a opcao para descobrir a area:");
		alternativa = entrada.nextInt();
		
		switch (alternativa)
		{
		    case 1 :
		        System.out.println("voce escolheu o triangulo");
		        System.out.println(" qual o valor da base:");
		        base = entrada.nextDouble();
		        System.out.println(" qual o valor da altura:");
		        altura = entrada.nextDouble();
		       area= base*altura/2;
		        System.out.println("O valor da sua area é: "+area );
		        break;
		    case 2 :
		        System.out.println("voce escolheu o retangulo");
		        System.out.println("qual  o valor da base:");
		        base = entrada.nextDouble();
		         System.out.println("qual  o valor da altura:");
		        altura = entrada.nextDouble();
		        area= base*altura;
		        System.out.println("O valor da sua area é: "+area);
		        break;
		     case 3 :
		         System.out.println("voce escolheu o quadrado");
		         System.out.println("qual o valor do lado:");
		         lado = entrada.nextDouble();
		         area= lado*lado;
		         System.out.println("O valor da sua area é: "+area);
		         break;
		      case 4 :
		          System.out.println("voce escolheu o trapézio");
		          System.out.println("qual o valor da base maior:");
		          bmaior=entrada.nextDouble();
		          System.out.println("qual o valor da base menor:");
		          bmenor=entrada.nextDouble();
		          System.out.println("qual o valor da altura:");
		          altura = entrada.nextDouble();
		          area=(bmaior*bmenor)*altura/2;
		         System.out.println("O valor da sua area é: "+area);
		         break;
		       
		          
		        
		          
		}
	}
}

