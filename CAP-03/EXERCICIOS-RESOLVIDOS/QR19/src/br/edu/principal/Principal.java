/*
 * Trabalho dee POO Quest�o 19: Cada degrau de uma escada tem X de altura. Fa�a um programa que receba essa altura e a altura que
 *o usu�rio deseja alcan�ar subindo a escada, calcule e mostre quantos degraus ele dever� subir para
 *atingir seu objetivo, sem se preocupar com a altura do usu�rio. Todas as medidas fornecidas devem
 *estar em metros.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura dos degraus(em metros): ");
		double AlturaD = sc.nextDouble();
		
		System.out.println("Digite a altura que deseja alcan�ar(em metros): ");
		double AlturaPedida = sc.nextDouble();
		// Calculo da altura solicitada.
		double QntDegraus = AlturaPedida/AlturaD;
        // Exibe o resultado.
		System.out.println("A quantidade de degraus necess�rias para chegar a: " + AlturaPedida + " � " + QntDegraus);
		
		
	}

}
