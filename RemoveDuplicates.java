package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.analysis.interpolation.SplineInterpolator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split = text.split(" ");
		List<String>list=new ArrayList<String>();
		list.addAll(Arrays.asList(text));
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				count=count+1; 
			
			}
			if (count<1) {
text=text+" ";

			}
			System.out.println(split[i]+" ");
			
		}
		     
		
		
	}

}
