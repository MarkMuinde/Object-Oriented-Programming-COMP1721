import java.util.*;
import java.lang.Character.*;
class Ex6 {
//this program will analyse a line of text input by the user
//and display the total number of characters, the number of letters, 
//the number of digits and the number of whitespace characters in it.

public static void main (String[] args){
System.out.print("Enter a line of text:");
Scanner input = new Scanner (System.in);
String character = input.nextLine();
int letterCount = 0;
int digitCount = 0;
int whitespaceCount = 0;

for (int i=0; i<character.length(); i++){
    if (Character.isWhitespace(character.charAt(i)))
        whitespaceCount++;
    if (Character.isLetter(character.charAt(i)))
        letterCount++;
    if (Character.isDigit(character.charAt(i)))
        digitCount++;
}
System.out.println(character.length() + " characters");
System.out.println(letterCount + " letters");
System.out.println(digitCount + " numbers");
System.out.println(whitespaceCount + " whitespaces");
}
}
