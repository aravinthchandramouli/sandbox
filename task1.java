import java.util.*;
import java.io.*; 
import java.util.Collections.*;
class Main{
public static void main (String[] args) {
    
      
       ArrayList<Integer> al = new ArrayList<Integer>();
       ArrayList<Integer> al1 = new ArrayList<Integer>();
       al.add(1);
       al.add(5);
       al.add(1);
       al.add(2);
       al.add(6);
       al.add(3);
       al.add(3);
       al.add(4);
       al.add(1);
       al.add(6);
       al.add(6);
       Collections.sort(al);
       System.out.println(al);
       
       for(int i:al) {
           if(!al1.contains(i))
           {
               al1.add(i);
           }
           else 
           {
               System.out.println(i);
           }
           
       }
       System.out.println(al1);
}
}