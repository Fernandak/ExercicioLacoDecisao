package ExercicioLaco;

import java.util.Scanner;

/*
 * 1- Faça um programa que receba três inteiros
 *  e diga qual deles é o maior.
 */
public class Exercicio1laco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1,num2,num3;

		System.out.println("Digite primeiro numero: ");
		num1 = entrada.nextInt();

		System.out.println("Digite segundo numero: ");
		num2 = entrada.nextInt();

		System.out.println("Digite terceiro numero: ");
		num3 = entrada.nextInt();

		if(num1 > num2 && num1 > num3){
			System.out.println("Maior numero: "+num1);
		}
		else if(num2 > num3){
			System.out.println("Maior numero: "+num2);
		}
		else
		{
			System.out.println("Maior numero: "+num3);
		}
		entrada.close();

	}

}
