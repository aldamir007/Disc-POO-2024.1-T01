/*
 * Trabalho de POO Quest�o 14: Fa�a um programa que receba o ano de nascimento de uma pessoa e o ano atual,
 * calcule e mostre: a) a idade dessa pessoa b) quantos anos ela tera em 2050.
 * Date: 02/03/24
 * LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento: ");
		int Nascimento = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int AnoAtual = sc.nextInt();
		if(AnoAtual < 2050 && Nascimento < 2050) {
		// Calculo da idade atual e a idade em 2050.
		int idadeAtual = AnoAtual - Nascimento;
		int idade2050 = 2050 - Nascimento;
		//Exibe o Resultado.
		System.out.println("Sua idade atual �: " + idadeAtual);
		System.out.println("A sua idade em 2050 ser� de: " + idade2050);
		
	    

	} else {
		// Exibe o erro.
		System.out.println("O ano digitado � invalido, pois � acima de 2050. Digite outro ano por favor");
		
	}

		
}
}
