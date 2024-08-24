package semana03;

public class St02 {

	public static void main(String[] args) {
		
		String s = "0912380921381sadsaakjdsGADSNNMX_JNJ&";
		String senha = "";
		
		for (int i = 0; i<6;i++) {
			int indice = (int)(Math.random()*s.length());
			senha += s.charAt(indice);
		}
		System.out.println(senha);
	}

}
