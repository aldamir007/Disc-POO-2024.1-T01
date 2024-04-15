/*
 * Trabalho de POO Quest�o 12:Fa�a um programa que receba dois n�meros maiores que zero,
 * calcule e mostre um elevado ao outro.
 * Date: 02/03/24
 * LastUpdate: 02/03/24 
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero positivo e maior que zero: ");
		double N1 = sc.nextDouble();
		
		System.out.println("Digite o segundo n�mero positivo e maior que zero: ");
		double N2 = sc.nextDouble();
		// IF para verificar se o n�mero � maior que zero e positivo
		if(N1 > 0 && N2 > 0) {
			// Calculo dos n�meros
			double Resultado = Math.pow(N1, N2);
			// Exibe o Resultado.
			System.out.println(N1 + " elevado a " +  N2  + " � igual a: " + Resultado);
		} else {
			// Exibe o erro
			System.out.println("Os n�meros inseridos n�o s�o validos. Digite outros n�meros.");
		}

		
	}

}
