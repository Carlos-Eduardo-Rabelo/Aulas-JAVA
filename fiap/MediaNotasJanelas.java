package br.com.fiap;

import javax.swing.JOptionPane;

public class MediaNotasJanelas {

	public static void main(String[] args) {
		
		float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		String auxiliar;
		try {
			auxiliar = JOptionPane.showInputDialog("Digite a primeira nota: ");
			nota1 = Float.parseFloat(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a segunda nota: ");
			nota2 = Float.parseFloat(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a terceira nota: ");
			nota3 = Float.parseFloat(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a quarta nota: ");
			nota4 = Float.parseFloat(auxiliar);
			JOptionPane.showMessageDialog(null, "Nota 1: " + nota1 + "\nNota 2: "
					+ nota2 + "\nNota 3: " + nota3 + "\nNota 4: " 
					+ nota4 + "\nMédia: " + ((nota1 + nota2 + nota3 + nota4)/4));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto");
		}

	}

}
