/*
 * Trabalho de POO Quest�o 11:Fa�a um programa que receba um n�mero positivo e maior que zero,
 * calcule e mostre: numero digitado ao quadrado, cubo, raiz quadrada do numero, raiz cubica do numero.
 * Date: 02/03/24
 * LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite um n�mero positivo e maior que zero: ");
	double numero = sc.nextDouble();
	// IF para assumir que o valor � maior que 0
	if(numero > 0) {
		// Calculo do quadrado, cubo, raizQ, raizC
		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow (numero, 3);
		double raizQuadrada = Math.sqrt(numero);
		double raizCubica = Math.cbrt(numero);
		// Exibe o Resultado
		System.out.println("O n�mero ao quadrado �: " + quadrado);
		System.out.println("O n�mero ao cubo �: " + cubo);
		System.out.println("A raiz quadrada do n�mero �: " + raizQuadrada);
		System.out.println("A raiz c�bica do n�mero �: " + raizCubica);
		
	} else {
		// Exibe o erro
			System.out.println("O n�mero digitado � invalido");
		}

	 
	
	}
	
	}


