import java.util.Scanner;
class Ex2 {
//this program converts time in seconds into hours, minutes and seconds
public static void main (String[] args) {
System.out.print("Enter a time in seconds:");
Scanner input = new Scanner (System.in);
int seconds = input.nextInt();
int minutes = seconds / 60; //get minutes
int secondsLeft = seconds % 60; //get remaining seconds
int hours = minutes / 60; //get hours
int minutesLeft = minutes % 60; //get remaining minutes
System.out.println(seconds + " seconds is " + hours + " hours and " + minutesLeft + " minutes and " + secondsLeft + " seconds");
}
}