package ExercicioLaco;

import java.util.Scanner;

/*
 * 4- Fa�a um programa em que permita a entrada de um n�mero
 * qualquer e exiba se este n�mero � par ou �mpar.
 *  Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */
public class Exercicio4Laco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Digite um numero: ");
		num = entrada.nextInt();

		if (num % 2 == 0 ) {
			System.out.println("O numero � par, sua raiz quadrada �: "+Math.sqrt(num));
		} else {
			System.out.println("O numero � impar, elevado ao quadrado �: "+Math.pow(num, 2));
		}

		entrada.close();

	}

}
