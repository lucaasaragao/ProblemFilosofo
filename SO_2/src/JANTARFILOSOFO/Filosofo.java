package JANTARFILOSOFO;

public class Filosofo extends Thread {

	private Mesa Mesa;
	int lugar;
	
	public Filosofo(Mesa Mesa, int lugar) {
		this.Mesa = Mesa;
		this.lugar = lugar;
		start();
	}
	
	public void run() {
		while(true) {
			pensando(lugar);
			Mesa.pegaHachi(lugar);
			comendo(lugar);
			Mesa.soltarHachi(lugar);
		}
	
	}

	private void comendo(int lugar2) {
		// TODO Auto-generated method stub
		System.err.println("O filofoso - " + lugar  +" "+ "começou a comer");
		try { 
			sleep((int) (Math.random()* 10000));
		}catch(InterruptedException e) {}
		System.out.println("O filosofo - " + lugar + " "+ "terminou de comer");
	}

	private void pensando(int lugar2) {
		// TODO Auto-generated method stub
		System.out.println("O filosofo - " + lugar + " "+ "está pensando");
		try { 
			sleep((int) (Math.random()* 10000));
		}catch(InterruptedException e) {}
	}

}