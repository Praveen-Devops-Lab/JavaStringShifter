package com.stringshifter;

import java.util.Scanner;

public class StringShifter {

	public static void main(String[] args) {
		
		final String REGEX_FOR_INPUT_STRING = "[a-zA-Z]+";
		
		try (Scanner scanner = new Scanner(System.in)) {
            String inputString;
            boolean validInput = false;
            // Loop for input validation for the string.
            do {
                System.out.println("Enter the string value:");
                inputString = scanner.nextLine();
                // Check if the input string contains only letters.
                if (inputString.matches(REGEX_FOR_INPUT_STRING)) {
                	validInput = true;  // Valid input, exit the loop.
                } else {
                    System.out.println("Invalid string. Please re-enter a string containing only letters.");
                }
            } while(!validInput);

            // Loop for input validation for number.
            System.out.println("Enter any number to shift characters position: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please re-enter a valid integer:");
                scanner.next();
            }
            int inputNum = scanner.nextInt();
            // calling shiftCharacters method to perform shift characters position for a given string.
            String result = shiftCharacters(inputString, inputNum);
            System.out.println("Shifted string : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	/**
     * Shifts the characters in the string by the specified number of positions.
     * 
     * @param str      The input string
     * @param shiftNum The number of positions to shift
     * @return The shifted string
     * 
     */

    public static String shiftCharacters(String str, int shiftNum) {
        if(str == null || str.isEmpty()) {
        	return str; // Return the original string if it's null or empty.
        }
    	int length = str.length(); 
    	// Wrap around appropriately if the second input is bigger than the length of the string.
        shiftNum = shiftNum % length;  
        if (shiftNum < 0) {
        	shiftNum += length;  // Adjust for negative shift numbers.
        }
        return str.substring(length - shiftNum) + str.substring(0, length - shiftNum);
    }

}
