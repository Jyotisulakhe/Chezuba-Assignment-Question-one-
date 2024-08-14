package Array;

import java.util.Arrays;
import java.util.Scanner;

public class IncrementNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);//is used in java, that can read input from the input stream
		// Input: Length of the array
		System.out.print("Enter the number of digits: ");// print text on console
		int n = scanner.nextInt();// using this line able to read an integer input from the user and store in n variable
		// Input: Array of digits
		int[] digits = new int[n];//create an array of integers with length
		System.out.print("Enter the digits: ");
		for (int i = 0; i < n; i++) {
		digits[i] = scanner.nextInt();
		}// reading multiple input from users and stores them in an array
		// Convert the array to a string
		StringBuilder numberStr = new StringBuilder();//This line creates a new, empty StringBuilder object called numberStr to 
		//efficiently build a string by appending characters or digits.
		for (int digit : digits) {
		numberStr.append(digit);
		}//This line iterates over each integer in the `digits` array and appends each integer as a character to the `numberStr` `StringBuilder` object.
		int number = Integer.parseInt(numberStr.toString());
		number += 1;//incrementing number by one 

		// Convert the number back to a string
		String resultStr = Integer.toString(number);

		// Create an array for the result
		int[] result = new int[resultStr.length()];
		for (int i = 0; i < resultStr.length(); i++) {
		result[i] = resultStr.charAt(i) - '0'; // Convert char to int
		}
		// Output the result
		System.out.println("Result: " + Arrays.toString(result)); 

	}

}
