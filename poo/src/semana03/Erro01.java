package semana03;

import javax.swing.JOptionPane;

public class Erro01 {

	public static void main(String[] args) {
		while (true) {
		try {	
			int idade = Integer.parseInt(
					JOptionPane.showInputDialog("Digite sua idade")
			);
			JOptionPane.showMessageDialog(null, "idade" + idade);
			break;
		}
		catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "burro filho da puta \n" +
		erro.getMessage());
		}
		finally {
			JOptionPane.showMessageDialog(null, "fim");
		}
		}
	}

}
