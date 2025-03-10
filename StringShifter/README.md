
# Java String Shifter

The Java String Shifter program will accept two inputs that are typed in (standard input) and return a string. The first input is a string, and the second input is a number. The resulting string will be the first input with the characters position shifted by the amount entered on the second input


# Features

- Validates that the input string contains only alphabetic characters.
- Accepts an integer input for shifting the string.
- Handles both positive and negative shift values.
- Ensures proper wrap-around when the shift value exceeds the string length.


# Installation and Running.

## Prerequisites

•	Java Development Kit (JDK) 8 or later installed.

•	A terminal or command prompt to run the program.

•	Or clone the Java project and import to Eclipse IDE.

## Running using Eclipse IDE :
1.	Clone the repository https://github.com/Praveen-Devops-Lab/JavaStringShifter.git.
2.	Import project to the Eclipse IDE.
3.	Go to StringShifter.java file in source folder src.
4.	Right click on the file and run as Java Application.
5.	Enter a valid string (alphabetic characters only) when prompted in the console.
6.	Enter an integer value to shift the string.
7.	The program will display the shifted string as a result.
8.	For Junit, right click on the file StringShifterTest.java located in test source folder and run as Junit Test.

## Running using Command line tool:
1.	Compile and run the program using the command line tool:

          a.	cd <set path to .java file from your local machine>
                 example: cd  Users\eclipse-workspace\JavaStringShifter\StringShifter

          b.	To compile run the command as   javac StringShifter.java

          c.    Run the program using the command Java StringShifter
3.	Enter a valid string (alphabetic characters only) when prompted.
4.	Enter an integer value to shift the string.
5.	The program will display the shifted string as a result.





## Note
In case of exception like Class has been compiled by a more recent version of the Java Environment. This is just a version mismatch. You have compiled your code using Java version X and your current JRE is version X. Try upgrading your JRE. Below are the codes for JRE for reference.

52 = Java 8

53 = Java 9

54 = Java 10

55 = Java 11

56 = Java 12

57 = Java 13

58 = Java 14

59 = Java 15

60 = Java 16

61 = Java 17

62 = Java 18

63 = Java 19

64 = Java 20

65 = Java 21

# Usage Examples
## Input:
Enter the string value: abcdef

Enter any number to shift characters position: 2

Enter the string value: hello world

Enter any number to shift characters position: 5

## Output:
Shifted string: efabcd

Shifted string: worldhello
# Code Explanation
•	The program validates the string input using a regular expression ([a-zA-Z]+).

•	It ensures that the shift value is an integer.
•	The shiftCharacters method performs the shifting operation by:

       1)	Using modulo (%) to handle cases where the shift value is greater than the string length.
       2)	Adjusting for negative shift values.
       3)	Concatenating substrings to generate the shifted output result.

# Error Handling
•	If the user enters non-alphabetic characters, they are prompted to re-enter a valid string.

•	If a non-integer value is entered for the shift amount, the program prompts for a valid integer.
# License
This project is open-source and free to use.
# Author
Developed by PraveenNeralla.