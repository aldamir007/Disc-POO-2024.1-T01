/*
 * Trabalho de POO Quest�o 20: Fa�a um programa que receba a medida do �ngulo (em graus) formado por uma escada apoiada no
 *ch�o e encostada na parede e a altura da parede onde est� a ponta da escada. Calcule e mostre a me-
 *dida dessa escada.
 *Observa��o: as fun��es trigonom�tricas implementadas nas linguagens de programa��o trabalham
 *com medidas de �ngulos em radianos.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Digite a medida do �ngulo(em graus): ");
	    double Angulo = sc.nextDouble();
	    
	    System.out.println("Digite a medida da altura da parede: ");
	    double Altura = sc.nextDouble();
	    // Calculo do Radiano e medida da escada
	    double Radiano = Angulo * Math.PI / 180;
	    double escada = Altura / Radiano;
	    // Exibe o resultado.
	    System.out.println("A medida da escada �: " + escada);
	    


	}

}
