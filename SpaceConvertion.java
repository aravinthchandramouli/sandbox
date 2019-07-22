import java.util.*;

class SpaceConvertion{
	
	public static void main(String args[])
	{
		
		String input = "This is      the program to     convert multiple spaces string into single    space string";
		String output = "";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' ')
			{
				output+=input.charAt(i);
			} 
			else if(input.charAt(i)==' ')
			{	
				if(input.charAt(i+1)!=' ')
				{
					output+=input.charAt(i);
				}
				else
				{
					i++;
				}
			}
		}
		
		System.out.println(output);
	}
}


