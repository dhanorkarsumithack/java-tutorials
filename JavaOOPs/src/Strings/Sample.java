package Strings;

import java.util.HashMap;

public class Sample {

	public static void main(String[] args) {
	      HashMap<Integer, Integer> tm=new HashMap<>();
	      int a[]= {2,5,1,6,7,3,7,8,4,6,8,4};
	     
	      for(int i=0;i<a.length;i++)
	      {
	    	  if(tm.containsKey(a[i])) {
	    		  tm.put(a[i], tm.get(a[i])+1);
	    	  }else {
	    		  tm.put(a[i], 1);
	    	  }
	      }
	      System.out.println(tm);
	}
}
