/*
 * Trabalho de POO Quest�o proposta 10: Fa�a um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
 *a) a idade dessa pessoa em anos;
 *b) a idade dessa pessoa em meses;
 *c) a idade dessa pessoa em dias;
 *d) a idade dessa pessoa em semanas.
 *Date: 06/03/24
 *LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento: ");
		int AnoNasc = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int AnoAtual = sc.nextInt();
		// Calculo da idade em anos, meses, dias e semanas
		int IdadeAnos = AnoAtual - AnoNasc;
		int IdadeMeses = IdadeAnos * 12;
		int IdadeDias = IdadeAnos * 365;
		int IdadeSemanas = IdadeDias / 7;
		// Exibe o resultado
		System.out.println("Sua idade em Anos �: " + IdadeAnos);
		System.out.println("Sua idade em meses �: " + IdadeMeses);
		System.out.println("Sua idade em dias �: " + IdadeDias);
		System.out.println("Sua idade em Semanas �: " + IdadeSemanas);
	     

	}

}
