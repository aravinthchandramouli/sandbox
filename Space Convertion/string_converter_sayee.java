import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class string_converter_sayee {
	
	public String string_convertion(String s1) {
		//1st Method
		//String replaceString=s1.replaceAll("  "," ");//replaces all occurrences of "a" to "e"  
		
		//2nd Method
		String[] strArray = s1.split("\\s");
		String overall_string = "";
        System.out.println(s1.length());
        for(int i=0; i< s1.length();i++)
        {
        	if (s1.charAt(i) != ' ')
        	{
        		overall_string +=s1.charAt(i);
        	}
        	else if (s1.charAt(i) == ' ')
        		{
        			if (s1.charAt(i + 1) != ' ')
        			{
        				overall_string += s1.charAt(i);
        			
        			}
        			else {
        				overall_string += s1.charAt(i);
        				i++;
        			}
        		}
        
        }  
        System.out.println(overall_string); 
		
		return overall_string;
		
		
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to remove multiple spaces:");
		String s1 = sc.nextLine();
		string_converter_sayee obj = new string_converter_sayee(); 
		String result = obj.string_convertion(s1);
		//System.out.println(result);

	}

}
