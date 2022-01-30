package ExercicioLaco;

import java.util.Scanner;

/*
 * 2- Faça um programa que entre com três
 *  números e coloque em ordem crescente.
 */
public class Exercicio2Laco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1, num2,num3;

		System.out.println("Digite primeiro numero: ");
		num1 = entrada.nextInt();

		System.out.println("Digite segundo numero: ");
		num2 = entrada.nextInt();

		System.out.println("Digite terceiro numero: ");
		num3 = entrada.nextInt();

		if (num1 <= num2 && num2 <= num3)
		{
			System.out.println("Ordem crescente: " +num1+"=>"+num2+"=>"+ num3);
		}
		else if (num1 <= num3 && num3 <= num2)
		{
			System.out.println("Ordem crescente: "+ num1+"=>"+num3+ "=>"+num2);
		}
		else if (num2 <= num1 && num1 <= num3)
		{
			System.out.println("Ordem crescente:"+ num2+"=>"+ num1+"=>"+ num3);
		}
		else if (num2 <= num3 && num3 <= num1) 
		{
			System.out.println("Ordem crescente: "+ num2+"=>"+ num3+"=>"+num1);
		}
		else if (num3 <= num1 && num1 <= num2) 
		{
			System.out.println("Ordem crescente:"+ num3+"=>"+ num1+"=>"+ num2);
		}
		else
		{
			System.out.println("Ordem crescente: "+ num3+"=>"+ num2+"=>"+ num1);
		}

		System.out.println();

		entrada.close();

	}

}
