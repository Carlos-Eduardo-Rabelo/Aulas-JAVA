package br.com.fiap;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		float raio = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in); // instânciação do obj da Classe
			System.out.println("Digite o raio do círculo");
			raio = scan.nextFloat();
			System.out.println("A área do círculo é: " + ((raio * raio) * 3.14) + "m²" );
			
		} catch (Exception e) {
			System.out.println("Formato de número incorreto!");
		}

	}

}
