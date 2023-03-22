package Esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;




public class ThreadProva extends Thread{

	public int result;
	private String nome;
	private int start;
	private int end;
	private int[] arr;
	//private List<Integer> arr;
	
	public ThreadProva (String nome, int start, int end) {
		this.nome = nome;
		this.start = start;
		this.end = end;
		this.CreaArray();
	}
	
	public void CreaArray() {
		
	this.arr = new int[3000];
		//this.arr = new ArrayList<Integer>();
		
		for(int i = 0; i < 3000; i++) {
			int b =(int)( Math.random() * 100) + 1;
			arr[i] = b;
			//arr.add(b);
		}
	}
	
	public void run() {
		  
		//Optional<Integer> sum = this.arr.stream().reduce((element1, element2) -> element1 + element2);
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
