package semana03;

import javax.swing.JOptionPane;

public class Erro05 {

	public static void main(String[] args) {
		String[] n = {"Ana", "Bia", "Sandro", "Mara"};
		while(true) {
		try {
			int indice = Integer.parseInt(JOptionPane.showInputDialog("Indice: "));
			JOptionPane.showMessageDialog(null, n[indice - 1]);
			break;
		}
		catch(ArrayIndexOutOfBoundsException erro) {
			JOptionPane.showMessageDialog(null, "Indice de 1 a 4: "+erro.getMessage());
		}
	}
	}

}
