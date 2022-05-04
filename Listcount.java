package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class Listcount {

	public static void main(String[] args) {
		int count=0;
		int num[]={1,2,3,1,4,1,1,6};
		List<Integer>list=new ArrayList<Integer>();
		list.add(6);
		list.addAll(list);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)==1);
			{
		count=count+1;
		
			}
			
		}
		System.out.println(count);
	
		
				
		
	
		

	}

}
