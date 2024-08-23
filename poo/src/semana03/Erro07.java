package semana03;

import javax.swing.JOptionPane;

public class Erro07 {

	public static void main(String[] args){
		float n1=-1,n2=-1,media=0;
		
		while(n1 < 0 || n1 > 10) {
			try {
				n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a n1: "));
				
			} 
			catch(Exception erro) {}
		while(n2 < 0 || n2 > 10) {
			try {
				n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a n2: "));
				
			} 
			catch(Exception erro) {}
		}
		
	}
}
