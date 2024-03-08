package br.com.fiap;

import java.util.Scanner;

public class IdadeUser {

	public static void main(String[] args) {
		int ano = 0, idade = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in); // instânciação do obj da Classe
			System.out.println("Digite o ano atual");
			ano = scan.nextInt();
			System.out.println("Digite seu ano de nascimento");
			idade = scan.nextInt();
			System.out.println("Sua idade é de: " + (ano - idade) + " anos");
			
		} catch (Exception e) {
			System.out.println("Formato de número incorreto!");
		}

	}

}
