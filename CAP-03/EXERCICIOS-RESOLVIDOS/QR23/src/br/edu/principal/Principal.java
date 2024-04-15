/*
 * Trabalho de POO Quest�o 23: Fa�a um programa que receba um n�mero real, encontre e mostre:
 *a) a parte inteira desse n�mero;
 *b) a parte fracion�ria desse n�mero;
 *c) o arredondamento desse n�mero.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero: ");
		double numero = sc.nextDouble();
		// Calcul n�mero inteiro, parte fracion�ria, arredondado
		int numeroInt = (int)numero;
		double parteFracionaria = numero - numeroInt;
		long Arredondado = Math.round(numero);
		
		// Exibe o resultado.
		System.out.println("A parte inteira do n�mero �: " + numeroInt);
		System.out.println("A parte fracion�ria do n�mero �: " + parteFracionaria);
		System.out.println("O n�mero arredondado �: " + Arredondado);

	}

}
