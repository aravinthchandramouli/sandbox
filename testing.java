import java.io.*;
import java.util.Scanner;
public class Main
{
    
    public static String acceptString()
    {
        String s; 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a string"); 
 		s = sc.nextLine();  
		System.out.println("You entered String "+s);
		return(s);
    }
    public static void removeSpace(){
    String str = acceptString();
StringBuffer buff = new StringBuffer();
String correctedString = "";
boolean space = false;
for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);
    if (c == ' ') {
        if (!space && i > 0) {
            buff.append(c);
        }
        space = true;
    }
    else {
        buff.append(c);
        space = false;
    }
}
String temp = buff.toString();
if (temp.charAt(temp.length() - 1) == ' ') {
    correctedString = temp.substring(0, buff.toString().length() - 1);
    System.out.println(correctedString);
}
System.out.println(buff.toString());

}
	public static void main(String[] args) {
	
	removeSpace();
	}
}
