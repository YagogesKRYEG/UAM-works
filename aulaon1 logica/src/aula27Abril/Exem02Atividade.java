package aula27Abril;
import java.util.Scanner;
public class Exem02Atividade {
	public static void main(String[] args) {
		boolean possuiMaisRenda = true;
		double[] lucros = new double[10];
		int contador = 0;
		Scanner entrada = new Scanner(System.in);

		// Recebendo rendimentos
		while (possuiMaisRenda) {
			System.out.println("Digite o valor do seu rendimento ou -1 para sair:");
			int lucro = entrada.nextInt();
			
			if (lucro > 0) {
				lucros[contador] = lucro;
				contador++;
			} else {
				possuiMaisRenda = false;
			}
		}

		// Calculando salários mínimo
		double lucroTotal = 0;
		for (double lucro : lucros) {
			lucroTotal += lucro;
		}
		double quantidadeSM = lucroTotal / 1000;

		System.out.println("Rendimento do ano: R$" + lucroTotal);
		System.out.println("\nSeus rendimentos é proporcional a " + quantidadeSM + " salários mínimos");

		// Calculando impostos
		double imposto;
		if (lucroTotal > 0 && lucroTotal < 3) {
			imposto = 0;
		} else if (lucroTotal >= 3 && lucroTotal < 6) {
			imposto = lucroTotal * 0.05;
		} else if (lucroTotal >= 6 && lucroTotal < 15) {
			imposto = lucroTotal * 0.10;
		} else {
			imposto = lucroTotal * 0.25;
		}
		System.out.println("\nImposto que deve ser pago: R$" + imposto);
	}
}
//Imposto é roubo