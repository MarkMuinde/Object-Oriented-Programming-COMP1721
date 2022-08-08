import java.util.*;
import java.math.*;
class Ex4 {
// this program will calculate the factorial of a given integer
public static void main (String[] args){
System.out.print("Enter an integer:");
Scanner input = new Scanner (System.in);
int n = input.nextInt();
BigInteger factorial = BigInteger.ONE;
for(int i = 1; i <= n; ++i)
{
    factorial = factorial.multiply(BigInteger.valueOf(i));
}
System.out.printf("The factorial of %d = %d", n, factorial);
 }
 }