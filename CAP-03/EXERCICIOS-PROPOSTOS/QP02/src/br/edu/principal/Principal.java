/*
 * Trabalho de POO Quest�o proposta 2:Fa�a um programa que receba tr�s n�meros, calcule e mostre a multiplica��o desses n�meros.
 * Date: 06/03/24
 * LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro n�mero: ");
		double n3 = sc.nextDouble();
        //Calculo de multiplica��o dos tr�s n�meros
		double multiplica��o = n1*n2*n3;
		
		System.out.println("O resultado da multiplica��o �: " + multiplica��o);
		

	}

}
