package sandbox;

public class RemoveExtraSpaces {

     public static void main(String[] args) {
    	 
		       String s = "my    name is    mr             space   ";
		       char[] charArray = s.toCharArray();
		       char prev = s.charAt(0);
		       for (int i = 0; i < charArray.length; i++) {
		           char cur = charArray[i];
		           if (cur == ' ' && prev == ' ') {
		        	   
		        	continue;
		           } 
		           
		           else {
		               System.out.print(cur);
		           }
		           prev = cur;
		       }
		   }
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

