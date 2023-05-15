package Generics;

import java.util.Arrays;

public class CustomArrayList {
	private int[] data;
	private static int DEFAULT_SIZE=2;
	private int size=0;
	
	public CustomArrayList() {
		this.data=new int[DEFAULT_SIZE];
	}
	
	public void add(int num) {
		if(isFull()) {
			resize();
		}		
		data[size++]=num;
	}
	
    private void resize() {
		int[] temp=new int[data.length+2];
		
		for(int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		
		data=temp;
	}

	private boolean isFull() {	 
		
		return size == data.length;
	}
	
	public int remove() {
		int removed=data[--size];
		return removed;
	}
	
	public int get(int index) {
		return data[index];
	}
	
	public int size() {
		return size;
	}
	
	public void set(int index,int value) {
		data[index]=value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Custom ArrayList:{"+Arrays.toString(data)+"}";
	}
	public static void main(String[] args) {
	   	CustomArrayList list=new CustomArrayList();
	   	list.add(3);
	   	list.add(5);
	   	list.add(8);
	   	
	   	System.out.println(list);
	}
}
