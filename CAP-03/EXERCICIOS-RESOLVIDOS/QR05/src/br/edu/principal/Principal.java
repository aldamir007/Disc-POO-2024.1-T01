/*
 * Trabalho de POO Quest�o 5:Fa�a um programa que receba o sal�rio de um funcion�rio e
 * o percentual de aumento, calcule e mostre o valor do aumento e o novo sal�rio:
 * Date: 01/03/24
 * LastUpdate: 01/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio inicial: ");
		double Sal�rioInicial = sc.nextDouble();
		
		System.out.println("Digite o percentual de aumento: ");
	    double PercentualAumento = sc.nextDouble();
		
	    // Calcula o valor do aumento
		double Aumento = Sal�rioInicial * (Sal�rioInicial/ 100.0);
		// Calcula o valor do novo sal�rio
		double NovoSal�rio = Sal�rioInicial + Aumento;
		//Exibe o Resultado
		System.out.println("O aumento � de: " + Aumento);
		System.out.println("O novo sal�rio � de: " + NovoSal�rio);

		
		
	}

}
