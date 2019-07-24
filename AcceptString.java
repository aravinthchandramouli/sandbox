package sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AcceptString {
	
	
		// Function to remove Extra spaces from a string
	public static String removeExtraSpace(String input) {
		   input= input.trim();
		   ArrayList <String> x= new ArrayList<>(Arrays.asList(input.split("")));
		   //System.out.println(x);
		   //System.out.println(x.size());
		   for(int i=0; i<x.size()-1;i++) {
		       if(x.get(i).equals(" ") && x.get(i+1).equals(" ")) { 
		           x.remove(i); 
		           i--; 
		       }
		   }
		   String word="";
		   for(String each: x) 
		   word+=each;
		   return word;
	}
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); 
		  // String input 
	     System.out.println("Enter input");
	     String input = sc.nextLine(); 
		String res=removeExtraSpace(input);
		System.out.println(res);
	}
}
	

