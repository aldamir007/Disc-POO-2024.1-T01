/*
 * Trabalho de POO Quest�o 7: Fa�a um programa que receba o sal�rio base de um funcion�rio, calcule e
 * mostre seu sal�rio a receber, sabendo-se que o funcion�rio tem gratifica��o de R$50 e paga imposto
 * de 10% sobre o sal�rio base.
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio base: ");
		int Sal�rioBase = sc.nextInt();
		// Calculo do Imposto
		int imp = Sal�rioBase * 10/100;
		// Calcula o sal�rio a ser recebido
		int Sal�rioReceber = Sal�rioBase + 50 - imp;
		// Exibe o Resultado
		System.out.println("O sal�rio a ser recebido �: " + Sal�rioReceber);
		
		
	}

}
