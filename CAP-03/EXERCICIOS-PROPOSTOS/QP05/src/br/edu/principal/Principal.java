/*
 * Trabalho de POO Quest�o proposta 5: Fa�a um programa que receba o n�mero de lados de um pol�gono convexo, calcule e mostre o n�mero
 *de diagonais desse pol�gono. Sabe-se que ND = N * (N - 3)/2, em que N � o n�mero de lados do
 *pol�gono.
 *Date: 06/03/24
 *LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de lados do pol�gono(convexo): ");
		double lados = sc.nextDouble();
		// Calculo das diagonais
		double Diagonais = lados * (lados-3)/2;
		// Exibe o resultado.
		System.out.println("O n�mero de diagonais desse pol�gono �: " + Diagonais);

		
		
	}

}
