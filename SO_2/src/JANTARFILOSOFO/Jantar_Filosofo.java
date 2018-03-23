package JANTARFILOSOFO;

public class Jantar_Filosofo {
	
	private static final int numDeFilosofos = 5;
	
	public static void main(String[] args) {
		
		Mesa Mesa = new Mesa(5);
		 for(int i = 0; i < numDeFilosofos; i++) {;
			new Filosofo (Mesa, i);
	
		 }
	}
}
