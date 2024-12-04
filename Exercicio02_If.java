package exercicio02_If;

import java.util.Scanner;

public class Exercicio02_If {

	public static void main(String[] args) {
		// Variaveis
		int numero;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		// Processamento
		if (numero % 2 == 0) {
			System.out.print("O número " + numero + " é par");
		} else {
			System.out.print("O número " + numero + " é impar");
		}
		if (numero > 0) {
			System.out.println(" e positivo.");
		} else {
			System.out.println(" e negativo.");
		}
		leia.close();

	}

}
