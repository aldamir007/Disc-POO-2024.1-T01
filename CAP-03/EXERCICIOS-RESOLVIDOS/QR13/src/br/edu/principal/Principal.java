/*
 * Trabalho de POO Quest�o 14: Fa�a um programa que receba uma medida em p�s,
 * fa�a as convers�es a seguir e mostre os resultados: a) polegadas; b) jardas; c) milhas;
 * Date: 02/03/24
 * LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida em p�s: ");
		double p�s = sc.nextDouble();
		// Calculo de polegadas, jardas e milhas
		double polegadas = p�s * 12;
		double jardas = p�s/3;
		double milhas = p�s/1760;
		// Exibe o resuiltado.
		System.out.println("A medida em polegadas �: " + polegadas);
		System.out.println("A medida em jardas �: " + jardas);
		System.out.println("A medida em milhas �: " + milhas);
		
		
		
		
		

	}

}
