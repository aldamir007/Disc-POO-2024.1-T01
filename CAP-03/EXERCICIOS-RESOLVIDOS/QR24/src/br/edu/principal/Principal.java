/*
 * Trabalho de POO Quest�o 24: Fa�a um programa que receba uma hora formada por hora e minutos (um n�mero real), calcule e
 *mostre a hora digitada apenas em minutos. Lembre-se de que:
 *para quatro e meia, deve-se digitar 4.30;
 *os minutos v�o de 0 a 59.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a hora(hora e minuto): ");
		double Hora = sc.nextDouble();
		// Calculo hora inteira, minutos, convers�o para minutos
		int HoraInt = (int) (Hora);
		double minuto = Hora - HoraInt;
		double Convers�o = (HoraInt*60) + (minuto * 100);
		// Exibe o resultado.
		System.out.println("a hora digitada em minutos �: " + Convers�o);

		

	}

}
