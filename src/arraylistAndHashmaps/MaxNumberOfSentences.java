package arraylistAndHashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


public class MaxNumberOfSentences {
	public static void main(String args[]) {
		String Sentences[] = {"alice and bob love leetcode","i think so too","this is great thanks very much"};

		List<Integer> list=new ArrayList<Integer>();  

	
		for(int i = 0 ; i < Sentences.length ; i++)
		{
		String temps = Sentences[i];
		//System.out.println(temps.length());
		int index = temps.indexOf(' ');
		int count = 0;
		
		
		//System.out.println(index);
		for(int j = 0 ; j< temps.length() ; j++) {
		 if(temps.charAt(j) == ' ') {
			 count = count + 1;
		 }
			
		}
		System.out.println(count);
		list.add(count);
		
		}
		
		System.out.println(Collections.max(list));
		
		}
	
	}
