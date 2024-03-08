package br.com.fiap;

import java.util.Scanner;

public class MediaProvas {

	public static void main(String[] args) {
		
		float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in); // instânciação do obj da Classe
			System.out.println("Digite as quatro notas");
			nota1 = scan.nextFloat();
			nota2 = scan.nextFloat();
			nota3 = scan.nextFloat();
			nota4 = scan.nextFloat();
			System.out.println("Nota 1: " + nota1 + "\nNota 2: " + nota2 
					+ "\nNota 3: " + nota3 + "\nNota 4: " + nota4 
					+ "\nMédia: " + ((nota1 + nota2 + nota3 + nota4)/4));
		} catch (Exception e) {
			System.out.println("Formato de número incorreto!");
		}
		
	}

}
