package ExercicioLaco;

import java.util.Scanner;

/*
 * 3- Fa�a um programa que receba a idade de uma pessoa 
 * e mostre na sa�da em qual
categoria ela se encontra:
10-14 infantil
 15-17 juvenil
18-25 adulto
 */
public class Exercicio3Laco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();

		if (idade >=10 && idade <=14) {
			System.out.println("Voc� est� na categoria infantil");

		}
		else if (idade >=15 && idade <=17) {
			System.out.println("Voc� est� na categoria juvenil");

		}
		else if (idade >=18 && idade <= 25) {
			System.out.println("Voc� est� na categoria adulto");

		}

		else {
			System.out.println("Idade n�o se enquadra nas categorias");	
		}
		entrada.close();


	}

}
