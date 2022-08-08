import java.io.*;
import java.util.*;

public class Ex11{
    public static void main (String[] args) throws FileNotFoundException{
        Map <String, Integer> phonebook = new HashMap<>();
        File phoneNumbers = new File("test.txt");
        Scanner input1 = new Scanner(phoneNumbers);
        while (input1.hasNext()){
            String userName = input1.nextLine();
            int userNumber = Integer.parseInt(input1.nextLine());
            phonebook.put(userName, userNumber);
        }

        Scanner input2 = new Scanner (System.in);
        while (true){
            System.out.print("Enter a name to find the person's number : ");
            String personName = input2.next();
            if(personName.equals("quit")){
                break;
            }
            else if (phonebook.get(personName) == null) {
                System.out.println ("The name has no match in the phonebook");
            }
            else{
            System.out.println (phonebook.get(personName));
            }
        }
    }
}