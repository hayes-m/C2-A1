import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class c2a1q3_2018_MarkHayes {
	static String letters;  	//class variables used throughout the program's methods
	static int number = 0;		
	static ArrayList<Character> concat = new ArrayList<Character>();
	static char shuffle;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);	//initialising the scanner method

		while (number > 10 || number < 5)		//while loop to ensure input falls within parameters
		{
			try 
			{
				System.out.print("Please enter a number between 5 and 10: ");
				number = in.nextInt();
			}
			catch (InputMismatchException ime)		//catches input that isn't a numerical digit to display error message
			{
				System.out.print("Invalid input. ");	//error message to prompt for correct input
				in.nextLine();
			}
		}

		System.out.print("Please enter a string of six letters: ");		//prompt for input for string input
		letters = in.next();
		while (letters.length() != 6)		//ensures user enters exactly six characters
		{
			try {
				System.out.print("Six please...");		//error message for correct number of digits
				letters = in.next();
			} finally
			{
				if (letters.length() == 6) 
				{System.out.println("Thanks");	//notification of correct input

				}
			}

		}


		in.close();		//closes scanner

		matrix(number, letters);		//invokes method to build matrix

		System.out.print("\nConcatenated string is: ");		//prints identifier for concatenated string

		String full = (concat.toString().replace("[","").replace(",", " ").replace("]","").replace(" ", ""));	//as printing an array to string results in brackets and commas around the elements, these are removed here
		
		if (number % 2 == 0) 		//if the user inputs an even number, the characters match up and properly prints the odd cells in odd rows																			
		{
			for (int i = 0; i < full.length(); i += 2)	//by iterating through the characters two at time, odd index cells are printed
				System.out.print(full.charAt(i));		//which are picked up by the .charAt field
		}
		else
		{	

			for (int i = 0; i < full.length(); i++)	//however, if the number is odd, the alignment is changed and further manipulation is needed

				if (i % 2 == 0 && i < number)		//to print if the number is even and in the first row
				{
					System.out.print(full.charAt(i));
				}
				else if (i >= number && i % 2 != 0 && i < number*2)	//odd and in the second row
				{
					System.out.print(full.charAt(i));
				}
				else if (i >= number*2 && i % 2 == 0 && i < number*3)	//even and in third row
				{
					System.out.print(full.charAt(i));
				}
				else if (i >= number*3 && i % 2 != 0 && i < number*4)	//odd and in fourth row
				{
					System.out.print(full.charAt(i));
				}
				else if (i >= number*4 && i % 2 == 0 && i < number*5)	//even and in fifth row
				{
					System.out.print(full.charAt(i));		//we can stop here as 10 is the maximum input 
				}											//in retrospect, I would have preferred to find the odd cells of each row individually before they got concatenated
		}													//I was unsure how to do this without iterating with the matrix for loop 
	}
	public static char matrix(int number, String letters) {		//the method to build the matrix
		for (int i = 0; i < number; i++) 						//outer loop
		{
			for (int j = 0; j < number; j++) {					//inner loop
				shuffle = (letters.charAt((int) (Math.random() * 6)));		//input letters are shuffled by using the .charAt and .random methods together
				if (i % 2 == 0)
					concat.add(shuffle);			//adding  to an arrayList for the concatenation section
				System.out.print(shuffle + " ");		//prints the inner loop
			}
			System.out.println();		//line break
		}
		return shuffle;			//returns matrix to the method
	}
}





