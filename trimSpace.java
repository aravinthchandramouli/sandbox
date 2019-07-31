package com.pyt.person;

import java.util.*;

public class trimSpace {
	
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sc.close();
	int ctr=0 ;
	char []sa=s.toCharArray();
	for(char ch:sa) {
			
		if(ch==' ') {
			ctr++;
			if(ctr==1) {
				System.out.print(ch);
			}
		}
		else {
			System.out.print(ch);
			ctr=0;
		}		
	}
}


}
