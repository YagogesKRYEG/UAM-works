package Atividadep05Maio;
import java.util.Scanner;

public class q5
{
	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
		 int count = 0;
		 int num = 0;
		 
		 while (num>=0){
		     do
		 {
		     System.out.println("Digite um numero positivo para ativar o contador ou um negativo para desativar:");
		   
		     num= entrada.nextInt();
		     if (num>9){
		         System.out.println("N�mero � maior que 9,  n�o pode ser computado!");
  }
		   	     else if(num >=0 && num<=9){
		    	 count++;
		         
		         System.out.println(" Numero entre 0 e 9 j� apareceu:" + count + "vezes");
		     }
		  
		 }while (num !=-1);
		 
		  System.out.println(" Voc� digitou os numeros de 0 � 9 por:" + count + "vezes");
		 }
	}
}