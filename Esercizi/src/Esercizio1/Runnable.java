package Esercizio1;

public class Runnable {

	public static void main(String[] args) {
	

		ThreadProva t1 = new ThreadProva("#", 10);
		ThreadProva t2 = new ThreadProva("*", 10);
		
		t1.start();
		t2.start();
	}

}
