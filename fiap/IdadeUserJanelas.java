package br.com.fiap;

import javax.swing.JOptionPane;

public class IdadeUserJanelas {

	public static void main(String[] args) {
		
		int ano = 0, idade = 0;
		String auxiliar;
		try {
			auxiliar = JOptionPane.showInputDialog("Digite o ano atual");
			ano = Integer.parseInt(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite o ano de seu nascimento");
			idade = Integer.parseInt(auxiliar);
			JOptionPane.showMessageDialog(null, "Sua idade é de: " + (ano - idade) 
					+ " anos");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto");
		}

	}

}
