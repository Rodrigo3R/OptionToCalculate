package senai;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		String menu = "Escolha uma op��o:\n";
		menu += "1 - Somar\n";
		menu += "2 - Subtrair\n";
		menu += "3 - Multiplicar\n";
		menu += "4 - Dividir\n";
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro n�mero"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo n�mero"));
		
		int result = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		
		switch (result) {
		case 1:
			double soma = numero1 + numero2;
			JOptionPane.showMessageDialog(null,"Resultado � = " + String.format("%.2f", soma));
			break;
		case 2:
			soma = numero1 - numero2;
			JOptionPane.showMessageDialog(null,"Resultado � = " + String.format("%.2f", soma));
			break;
		case 3:
			soma = numero1 * numero2;
			JOptionPane.showMessageDialog(null,"Resultado � = " + String.format("%.2f", soma));
			break;
		case 4:
			soma = numero1 / numero2;
			JOptionPane.showMessageDialog(null, "Resultado � = " + String.format("%.2f", soma));
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida");
			break;
		}

	}

}
