/*
 * Trabalho de POO Quest�o 16:Fa�a um programa que receba o n�mero de horas trabalhadas e o valor
 * do sal�rio m�nimo, calcule e mostre o sal�rio a receber, seguindo estas regras: a) a hora trabalhada vale a metade do sal�rio m�nimo.
 * b) o sal�rio bruto equivale ao n�mero de horas trabalhadas multiplicado pelo valor da hora trabalhada.
 * c) o imposto equivale a 3% do sal�rio bruto.
 * d) o sal�rio a receber equivale ao sal�rio bruto menos o imposto.
 * Date: 05/03/24
 * LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de horas trabalhadas: ");
		int HorasT = sc.nextInt();
		
		System.out.println("Digite o valor do sal�rio minimo: ");
		double Sal�riom = sc.nextInt();
		// Calculo do sal�rio liqu�do
		double valorhorasT = Sal�riom / 2;
		double Sal�rioBruto = HorasT*valorhorasT;
		double imposto = Sal�rioBruto* 3/100;
		double Sal�rioLiq = Sal�rioBruto - imposto;
		// Exibe o Resultado.
		System.out.println("O valor do sal�rio liquido �: " + Sal�rioLiq);
		

		
	}

}
