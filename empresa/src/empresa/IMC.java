package empresa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
		
	System.out.print("Digite seu peso (em kg): ");
		int peso = teclado.nextInt();
		
	System.out.print("Digite sua altura (em metros): ");
		double altura = teclado.nextDouble();
			
	// Validando os valores inseridos
	while (peso <= 0 || altura <= 0) {
		System.out.println("Informe valores positivos ");
		
		System.out.print("Digite seu peso novamente: ");
			peso = teclado.nextInt();
		
		System.out.print("Digite sua altura novamente: ");
			altura = teclado.nextDouble();
		}
    // Cálculo do IMC
	double imc = peso / (altura * altura);
		
    // Formatação do IMC com duas casas decimais
	DecimalFormat df = new DecimalFormat("0.00");
		String imcFormatado = df.format(imc);
		
	System.out.print("Seu IMC: "+ imcFormatado);
}
}
