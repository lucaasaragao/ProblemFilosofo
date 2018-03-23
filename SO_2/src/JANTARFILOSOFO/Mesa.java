package JANTARFILOSOFO;

public class Mesa extends Thread {
	
	private boolean [] hachiUsado;
	
	public Mesa (int numDeHachi){
		hachiUsado = new boolean [numDeHachi];
		
		for (int i = 0; i < hachiUsado.length; i++)
			hachiUsado[i] = false;
		}
	
	private int esquerda (int i) {
		return i;
	}
	
	private int direita (int i) {
		if(i+1 < hachiUsado.length) {
			return i+1;
		}else {
			return 0;
		}
	}
	
	public synchronized void pegaHachi(int lugar) {
		while (hachiUsado[esquerda(lugar)] || hachiUsado[direita (lugar)]) {
			try {
				wait();
				
			} catch (InterruptedException e) {} 
			
		} 
		
		hachiUsado[esquerda(lugar)] = true;
		hachiUsado[direita(lugar)] = true;
			
		}
	
	public synchronized void soltarHachi(int lugar) {
		
		hachiUsado[esquerda(lugar)] = false;
		hachiUsado[direita(lugar)] = false;
		notifyAll();
	}
	
}
	
	

