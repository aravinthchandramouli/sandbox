import java.util.*;

public class SpaceConvertion{
	//input string 
	public static String input = "This is      the program to     convert multiple spaces string into single    space string";
	//Method to convert the string into single spaced string.
	private String convertSpace(String input)
	{
		//string to store the final output
		String output = "";
		/*
		*The loop iterates through the input string. 
		*First if condition will check if the character not a space then append to output
		*Else if will check for continues spcaes if there are continues spaces then it will go to the next character.
		*finally the string output has the required result. 
		*/
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' ')
			{
				output+=input.charAt(i);
			} 
			else if(input.charAt(i)==' ')
			{	
				while(input.charAt(i+1)==' ')
					i++;
				output+=input.charAt(i);
			}
		}
		return output;
	}
	public static void main(String args[])
	{
		SpaceConvertion s = new SpaceConvertion();
		String output = s.convertSpace(input); //Calling function to reduce space.
		System.out.println(output); //Print the final output.
	}
}


