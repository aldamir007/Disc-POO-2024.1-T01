/*
 * Trabalho de POO Quest�o 25: Fa�a um programa que receba o custo de um espet�culo teatral e o pre�o do convite desse espet�culo.
 *Esse programa dever� calcular e mostrar a quantidade de convites que devem ser vendidos para que,
 *pelo menos, o custo do espet�culo seja alcan�ado.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo do espet�culo teatral: ");
		double CustoTeatro = sc.nextDouble();
		
		System.out.println("Digite o custo do convite: ");
		double CustoConvite = sc.nextDouble();
		
		// Calculo da quantidade de convites necess�ria
		double  Quantidade = CustoTeatro/CustoConvite;
		// Exibe o resultado.
		System.out.println("A quantidade de convites necess�ria �: " + 	Quantidade);
		
		
		
	}

}
