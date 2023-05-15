package Sumit.JavaTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sword {
	public static void wholeft(List<Integer> list,int index,int k) {
		
		if(list.size()==1) {
			System.out.println("left person is "+list.get(0));
			return ;
		}
		
		index=(index+k)%list.size();
		
		list.remove(index);
		
	   wholeft(list, index, k);
		
	}

   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		
		wholeft(list, 0, 1);
		
		
	}
}
