/*
 * Trabalho de POO Quest�o proposta 8: Fa�a um programa que calcule e mostre a �rea de um trap�zio.
 *Sabe-se que: A = ((base maior + base menor) * altura)/2
 *Date: 06/03/24
 *LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base maior: ");
		double baseM = sc.nextDouble();
		System.out.println("Digite o valor da base menor: ");
		double basem = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		double Altura = sc.nextDouble();
		// calculo da �rea
		double Area = ((baseM + basem) * Altura) / 2;
		// Exibe o resultado.
		System.out.println("A �rea do trap�zio �: " + Area);
		

		

	}

}
