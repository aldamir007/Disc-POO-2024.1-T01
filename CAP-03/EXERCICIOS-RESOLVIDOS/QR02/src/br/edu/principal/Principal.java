/*
 * Trabalho de POO Quest�o 2:  Fa�a um programa que receba tr�s notas, calcule e mostre a m�dia 
 * Date: 01/03/24
 * LastUpdate: 01/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		// N�meros para m�dias
		
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int n2 = sc.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		int n3 = sc.nextInt();
		
		// Calcular m�dia dos n�meros
		int m�dia = n1 + n2 + n3 / 3;
	    // Exibe o resultado.
		System.out.println("A m�dia dos n�meros �: " + m�dia);
		
	

	}

}
