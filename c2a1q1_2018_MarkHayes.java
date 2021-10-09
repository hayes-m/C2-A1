import java.util.Scanner;
//importing the 'scanner' method

public class c2a1q1_2018_MarkHayes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);	//initialising the scanner method
		System.out.println("Please enter a coded string: ");	//prompting for user input


		String input = in.nextLine();	//grabbing the input and assigning it to a string variable
		char firstCharacter = input.charAt(0);	//assigning the first character to a char variable
		int inputLength = input.length();	//assigning the first numerical digit to an int variable

		in.close();		//closes scanner
		
		if (firstCharacter == 'u')
		{
			String u = input.toUpperCase();	//using the 'toUpperCase' method to convert a string
			System.out.print("The decoded string is: " + u);	//output
		}	
		else if (firstCharacter == 'l') 
		{
			String l = input.toLowerCase();	//using the 'toLowerCase' method to convert a string
			System.out.print("The decoded string is: " + l);	//output
		}	
		else if (firstCharacter == 'e') 
		{
			if ((inputLength % 2) == 1) //assesses whether or not the string has an even or odd number of letters
			{
				System.out.print("The decoded string is: ");	//output before the for loop so that it does not get reiterated in result
				for (int i = 0; i <= inputLength; i += 2)	//a loop to iterate and grab evenly indexed characters from the string
				{
					System.out.print(input.charAt(i));	//output
				}
			}
			else
			{
				System.out.print("The decoded string is: ");
				for (int i = 0; i < (inputLength-1); i += 2)	//this loop subtracts 1 from the number of letters in the string to tell the program it can print the final even index
				{
					System.out.print(input.charAt(i));
				}
			}
		}

		else if (firstCharacter == 'o') 
		{
			if ((inputLength % 2) == 0) //assesses whether string has even or odd number of letters
			{
				System.out.print("The decoded string is: ");
				for (int i = 1; i <= inputLength; i += 2)
				{
					System.out.print(input.charAt(i));
				}
			}
			else
			{
				System.out.print("The decoded string is: ");
				for (int i = 1; i <= (inputLength-1); i += 2) //again, the loop subtracts one in order to 'land' on an odd index without searching for the next
				{
					System.out.print(input.charAt(i));
				}
			}
		}
		else if ((firstCharacter>='1') && (firstCharacter<='9'))	//assesses if first character input is a number
		{
			int x = Character.getNumericValue(firstCharacter);	//assigns the first character as an integer variable to be passed to the substring
			System.out.print(input.substring(0,x));	//output of the modified text with the variable telling the substring on which character index to stop
		}
		else
			System.out.println("Enjoy your string: " + input);	//if input does not follow the above constraints, input shall be displayed as normal

	}

}


