package semana03;

import javax.swing.JOptionPane;

public class Erro05 {

	public static void main(String[] args) throws InterruptedException{
		String[] n = {"Ana", "Bia", "Sandro", "Mara"};
		
		for(int i = 0; i<5; i++) {
			System.out.println(n[i]);
			Thread.sleep(100);
		}
	}
}
