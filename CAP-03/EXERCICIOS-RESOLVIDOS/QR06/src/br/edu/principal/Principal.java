/*
 * Trabalho de POO Quet�o 6: Fa�a um programa que receba o sal�rio base de um funcion�rio,
 * calcule e mostre o sal�rio a receber, sabendo-se que o funcion�rio tem gratifica��o de 5%
 * sobre o sal�rio base e paga imposto de 7% tamb�m sobre o sal�rio base.
 * Date: 01/03/24
 * LastUpdate: 01/03/24 
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o sal�rio base: ");
		int Sal�rioBase = sc.nextInt();
		// Calcula gratifica��o e imposto. (5% e 7% respectivamente.)
		int grat = Sal�rioBase * 5/100;
		int imp = Sal�rioBase * 7/100;
		// Calcula o sal�rio a ser recebido.
		int Sal�rioReceber = Sal�rioBase + grat - imp;
		// Exibe o Resultado.
		System.out.println("O sal�rio a receber �: " + Sal�rioReceber);
		
		
	}

}
