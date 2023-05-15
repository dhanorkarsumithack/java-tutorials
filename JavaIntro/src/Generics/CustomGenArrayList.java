package Generics;

import java.util.Arrays;

public class CustomGenArrayList<T > {
	private Object[] data;
	private static int DEFAULT_SIZE=10;
	private int size=0;
	
	public CustomGenArrayList() {
		this.data=new Object[DEFAULT_SIZE];
	}
	
	public void add(T num) {
		if(isFull()) {
			resize();
		}		
		data[size++]=num;
	}
	
    private void resize() {
		Object[] temp=new Object[data.length+2];
		
		for(int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		
		data=temp;
	}

	private boolean isFull() {	 
		
		return size == data.length;
	}
	
	public T remove() {
		T removed=(T)(data[--size]);
		return removed;
	}
	
	public T get(int index) {
		return (T)(data[index]);
	}
	
	public int size() {
		return size;
	}
	
	public void set(int index,T value) {
		data[index]=value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Custom ArrayList:"+Arrays.toString(data);
	}
	public static void main(String[] args) {
	   	CustomGenArrayList<Integer> list=new CustomGenArrayList<>();
	   	list.add(4);
	   	list.add(8);
	   	list.add(8);
	   	
	   	System.out.println(list);
	   	
	   	CustomGenArrayList<String> list1=new CustomGenArrayList<>();
	   	
	   	list1.add("sumit");
	   	list1.add("Sumit2");
	   	list1.add("sumit3");
	   	
	   	System.out.println(list1);
	   	
	}
}
