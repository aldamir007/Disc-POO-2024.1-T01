/*
 * Trabalho de POO Quest�o proposta 9: Fa�a um programa que receba o valor do sal�rio m�nimo e o valor do sal�rio de um funcion�rio, calcule
 *e mostre a quantidade de sal�rios m�nimos que esse funcion�rio ganha.
 *Date: 06/03/24
 *LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do sal�rio m�nimo: ");
		double SalarioMinimo = sc.nextDouble();
		System.out.println("Digite o valor do funcion�rio: ");
		double SalarioFuncionario = sc.nextDouble();
		// Calculo da quantidade de sal�rios m�nimos
		double SalarioQnt = SalarioFuncionario / SalarioMinimo;
		// Exibe o resultado
		System.out.println("O funcion�rio ganha " + SalarioQnt + "sal�rios m�nimos");


	}

}
