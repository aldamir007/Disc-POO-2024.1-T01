/*
 * Trabalho de POO Quest�o 9: 
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite aqui o Valor da base do seu tri�ngulo: ");
		int Base = sc.nextInt();
		
		System.out.println("Digite aqui o valor da altura do seu tri�ngulo: ");
		int Altura = sc.nextInt();
		// calculo da area
		int Area = (Base * Altura)/2;
		// Exibe o resultado
		System.out.println("A �rea do tri�ngulo �: " + Area);
		
		
	}

}
