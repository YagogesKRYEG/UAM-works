package Atividadep05Maio;

import java.util.Scanner; 

public class q6 {
 public static void main(String[] args) {
 Scanner read = new Scanner(System.in); 
 int x, y, z, w; 
 
 System.out.print("Digite um Número: ");
 x = read.nextInt();
 
 y = x % 10;
 
 x = x / 10;
 
 w = x % 10;

 x = x / 10;
 
 z = x % 10;

 System.out.printf("\nUnidade = %d\nDezena = %d\nCentena = %d\n", y, w, z);
 }
}