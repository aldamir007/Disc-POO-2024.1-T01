/*
 * Trabalho de POO Quest�o 18: Pedro comprou um saco de ra��o com peso em quilos. Ele possui dois gatos, para os quais fornece a
 *quantidade de ra��o em gramas. A quantidade di�ria de ra��o fornecida para cada gato � sempre a
 *mesma. Fa�a um programa que receba o peso do saco de ra��o e a quantidade de ra��o fornecida para
 *cada gato, calcule e mostre quanto restar� de ra��o no saco ap�s cinco dias.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso do saco de ra��o(em KG): ");
		double PesoSaco = sc.nextDouble();
		
		System.out.println("Digite a quantia de ra��o para o primeiro gato(em gramas): ");
		double Gato1 = sc.nextDouble();
		
		System.out.println("Digite a quantia de ra��o para o segundo gato(em gramas): ");
		double Gato2 = sc.nextDouble();
		// Calculo ra��o de cada gato
		double Ra��oG1 = Gato1/1000;
		double Ra��oG2 = Gato2/1000;
		// Calculo resto da ra��o ap�s 5 dias ( mesma quantidade aos dias)
		double RestoFinal = PesoSaco - 5 * (Ra��oG1 + Ra��oG2);
		// Exibe o resultado.
		System.out.println("O total que restar� no saco de ra��o � de: " + RestoFinal);
		
		
		
		
		
	}

}
