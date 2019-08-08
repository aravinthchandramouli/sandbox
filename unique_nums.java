package com.pyt.person;
import java.util.*;
public class unique_nums {
	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
	sc.close();
	for(int i=0;i<n;i++) {
		if(!al.contains(arr[i])) {
			al.add(arr[i]);
		}
		}
	for(int i:al) {
		System.out.printf("%d ",i);
	}
	}
	
}
