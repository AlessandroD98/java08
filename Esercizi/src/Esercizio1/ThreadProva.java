package Esercizio1;

public class ThreadProva extends Thread {

	String s;
	int n;
	
public ThreadProva (String s, int n) {
	this.s=s;
	this.n=n;
}
	
@Override
public void run() {
	for(int i = 0; i <= n; i++) {
		System.out.println("Stampa n: " + i + " " + this.s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
	} 
}

}
