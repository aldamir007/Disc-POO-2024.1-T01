/*
 * Trabalho de POO Quest�o 4:Fa�a um programa que receba o sal�rio de um funcion�rio, calcule e mostre o novo sal�rio,
 * sabendo-se que este sofreu um aumento de 25%.
 * Date: 01/03/24
 * LastUpdate: 01/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite aqui o sal�rio inicial: ");
		int Sal�rioInicial = sc.nextInt();
		// Calculo do novo sal�rio
		int NovoSal�rio = Sal�rioInicial + Sal�rioInicial * 25/100;
		//Exibe o Resultado.
		System.out.println("O novo sal�rio ser� de: " + NovoSal�rio);
		
		
	}

}
