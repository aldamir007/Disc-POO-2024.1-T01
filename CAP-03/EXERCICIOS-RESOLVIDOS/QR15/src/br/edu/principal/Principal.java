/*
 * Trabalho de POO Quest�o 15: O custo ao consumidor de um carro novo � a soma do pre�o
 * de f�brica com o percentual de lucro do distribuidor e dos impostos aplicados ao pre�o
 * de f�brica. Fa�a um programa que receba o pre�o de f�brica de um ve�culo, o percentual
 *  de lucro do distribuidor e o percentual de impostos, calcule e mostre:
 *  a) o valor correspondente ao lucro do distribuidor; b) o valor correspondente aos impostos; 
 *  c) o pre�o final do ve�culo;
 *  Date: 02/03/24
 *  LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor de f�brica do ve�culo: ");
	double valorF�brica = sc.nextDouble();
	
	System.out.println("Digite o percentual de lucro do distribuidor: ");
	double percentualLucro = sc.nextDouble();
	
    System.out.println("Digite o percentual do imposto: ");
    double percentualImposto = sc.nextDouble();
    // Calculo do lucro do distribuidor, imposto e pre�o final do ve�culo
    double lucroDistribuidor = valorF�brica * percentualLucro/100;
    double valorImposto = valorF�brica * percentualImposto/100;
    double pre�oFinal = valorF�brica + lucroDistribuidor + valorImposto;
    // Exibe o resultado.
    System.out.println("o lucro do distribuidor ser� de: " + lucroDistribuidor);
    System.out.println("o valor do imposto ser� de: " + valorImposto);
    System.out.println("o pre�o final do ve�culo ser� de: " + pre�oFinal);
    
    

	}

}
