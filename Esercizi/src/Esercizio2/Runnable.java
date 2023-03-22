package Esercizio2;

public class Runnable {

	public static void main(String[] args) {
		
		ThreadProva t1 = new ThreadProva("Thread1", 0, 1000);
		ThreadProva t2 = new ThreadProva("Thread2", 1000, 2000);
		ThreadProva t3 = new ThreadProva("Thread3", 2000, 3000);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			System.out.println("Risultato finale: " + (t1.result + t2.result + t3.result));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
