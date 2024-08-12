package menu;

import javax.swing.JOptionPane;

import Controller.recursividadeController;

public class view {

	
	public static void main(String[] args) {
		
		recursividadeController funcao = new recursividadeController();
		
		int valor = 0;
		
		while (valor <= 0) { 
			try {
				valor = Integer.parseInt(JOptionPane.showInputDialog("Insira N a ter a somatoria calculada segundo a formula /n1 + 1/2 + 1/3 ... 1/n"));
				JOptionPane.showMessageDialog(null, "O resultado é: " + funcao.somatoria(valor, 1));
			} catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Insira um valor inteiro");
			}
			
			if (valor <= 0) {
				JOptionPane.showMessageDialog(null, "O valor precisa ser maior que zero uma vez que: /n1 + 1/0 + 1/-1 + 1/-2 ... 1/n passa por uma divisão impossível, por zero");
			}
		}
	}		
}
