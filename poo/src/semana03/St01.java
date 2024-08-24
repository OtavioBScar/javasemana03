package semana03;

public class St01 {

	public static void main(String[] args) throws InterruptedException{
		String sim = "sexta feira a aula é boa";
		//System.out.println(sim.length());
		//System.out.println(sim.charAt(9));
		
		/*for(int i = 0; i < sim.length(); i++) {
			System.out.println(sim.charAt(i));
			Thread.sleep(500);
		}*/
		String aloha = "";
		for(int i = sim.length()-1; i >= 0; i--) {
			aloha += (sim.charAt(i));
		}
		System.out.println(sim);
		System.out.println(aloha);
	}

}
