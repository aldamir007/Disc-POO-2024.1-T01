/*
 * Trabalho de POO Quest�o 10:  Fa�a um programa que calcule e mostre a �rea de um c�rculo.
 * Sabe-se que: �rea = p * R�
 * Date: 02/03/24
 * LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite aqui o raio do seu c�rculo: ");
	double Raio = sc.nextDouble();
	// Valor de Pi
	double pi = Math.PI;
	
	// Calculo da �rea
	double Area = pi * Math.pow(Raio, 2);
	// Exibe o Resultado.
	System.out.println("A �rea do seu c�rculo �: " + Area);
	
	
	
	}

}
