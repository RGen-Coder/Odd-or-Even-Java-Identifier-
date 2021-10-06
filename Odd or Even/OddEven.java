import java.util.Scanner;

public class OddEven {

public static void main(String args[]) {

Scanner scan = new Scanner(System.in);

System.out.print("Enter a number: ");
int x = scan.nextInt();

if (x % 2 == 0)
	System.out.print(x + " is Even " + "   " + "   ");
else
	System.out.print(x + " is Odd " + "   ");
}
}