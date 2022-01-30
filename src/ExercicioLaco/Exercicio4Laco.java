package ExercicioLaco;

import java.util.Scanner;

/*
 * 4- Faça um programa em que permita a entrada de um número
 * qualquer e exiba se este número é par ou ímpar.
 *  Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */
public class Exercicio4Laco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Digite um numero: ");
		num = entrada.nextInt();

		if (num % 2 == 0 ) {
			System.out.println("O numero é par, sua raiz quadrada é: "+Math.sqrt(num));
		} else {
			System.out.println("O numero é impar, elevado ao quadrado é: "+Math.pow(num, 2));
		}

		entrada.close();

	}

}
