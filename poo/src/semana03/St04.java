package semana03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class St04 {

	public static void main(String[] args){
		String nomes = "Ana;Bia;Carla;Denis;Elaine;Fabio";
		String[] n = nomes.split(";");
		for (String s:n) {
			System.out.println(s);
		}
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("c:/temp/pessoas.txt");
			pw.println("Lista de pessoas legais");
			for (String s:n) {
				pw.println(s);
			}
		} 
		catch (FileNotFoundException erro) {
			System.out.println("Impossivel escrever no arquivo!" + erro);
		}
		finally {
			pw.close();
		}
	}
}
