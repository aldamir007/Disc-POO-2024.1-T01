/*
 * Trabalho de POO Quest�o 8: Fa�a um programa que receba o valor de um dep�sito e
 *  mostre o valor do rendimento e o valor total depois do rendimento.
 *  Date: 02/03/24
 *  LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dep�sito: ");
		double Dep�sito = sc.nextDouble();
		System.out.println("Digite o valor da taxa de juros: ");
		double Taxa = sc.nextDouble();
		// Calculo do Rendimento, Valor total
		double Rendimento = Dep�sito * Taxa/100;
		double ValorTotal = Dep�sito + Rendimento;
		// Exibe o Resultado.
		System.out.println("O valor do rendimento � de: " + Rendimento);
		System.out.println("o valor total � de: " + ValorTotal);
		
		
	}

}
 