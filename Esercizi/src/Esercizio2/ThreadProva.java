package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class ThreadProva extends Thread{

	public int result;
	private String nome;
	private int start;
	private int end;
	private int[] arr;
	
	public ThreadProva (String nome, int start, int end) {
		this.nome = nome;
		this.start = start;
		this.end = end;
		this.CreaArray();
	}
	
	public void CreaArray() {
		
	this.arr = new int[3000];
		
		for(int i = 0; i < 3000; i++) {
			arr[i] = (int)( Math.random() * 100) + 1;
			
		}
	}
	
	public void run() {
		  
		int[] array = arraySlice();
		List<Integer> finalArray = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++) {
			finalArray.add(array[i]);
		}
		
		int sum = finalArray.stream().reduce((element1, element2) -> element1 + element2).orElse(0);
		System.out.println("Risultato parziale di " + this.nome + ": " + sum);
		result = sum;
	}
	
	public  int[] arraySlice() {
		
		int[] slice = new int[this.end - this.start];
		for(int i = 0; i < slice.length; i++) {
			slice[i] = this.arr[this.start + i];
		}
		return slice;
	}
	
}
