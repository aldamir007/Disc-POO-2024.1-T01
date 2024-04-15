/*
 * Trabalho de POO Quest�o 22: Sabe-se que o quilowatt de energia custa um quinto do sal�rio m�nimo. Fa�a um programa que rece-
 *ba o valor do sal�rio m�nimo e a quantidade de quilowatts consumida por uma resid�ncia. Calcule e mostre:
 *a) o valor de cada quilowatt;
 *b) o valor a ser pago por essa resid�ncia;
 *c) o valor a ser pago com desconto de 15%.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do sal�rio m�nimo: ");
		double sal�riom = sc.nextDouble();
		
		System.out.println("Digite a quantidade de quilowatts: ");
		double QuilowattsQuantidade = sc.nextDouble();
		// Calculo do quilowatts, valor a pagar, desconto, e valor a pagar - desconto.
		double valorQuilowatts = sal�riom/5;
		double valorPagar = valorQuilowatts * QuilowattsQuantidade;
		double desconto = valorPagar * 15/100;
		double valorPagarD = valorPagar - desconto;
		// Exibe o resultado.
		System.out.println("o valor do quilowatt: " + valorQuilowatts);
		System.out.println("o valor a ser pago: " + valorPagar);
		System.out.println("o valor a ser pago com desconto: " + valorPagarD);
		


	}

}
