package semana03;

import javax.swing.JOptionPane;

public class Erro03 {

	public static void main(String[] args) {
		
		try {
			int qtde = Integer.parseInt(
					JOptionPane.showInputDialog("qtde: ")
			);
			int valor = Integer.parseInt(
					JOptionPane.showInputDialog("valor: ")
			);
			int calculo = valor/qtde;
			JOptionPane.showMessageDialog(null, "Cálculo: "+calculo);
		}
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digite um valor inteiro: "+erro.getMessage());
		}
		catch(ArithmeticException erro) {
			JOptionPane.showMessageDialog(null, "segundo valor não pode ser zero" + erro.getMessage());
		}

	}

}
