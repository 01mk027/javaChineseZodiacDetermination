import java.net.SocketTimeoutException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Defining variables and creating instance of Scanner class
        int birthYear;
        Scanner input = new Scanner(System.in);

        //Getting birth year of user
        System.out.println("Please enter your birth year:");
        birthYear = input.nextInt();

        if(birthYear % 12 == 0)
        {
            System.out.println("Your chinese zodiac is Monkey.");
        }
        else if(birthYear % 12 == 1)
        {
            System.out.println("Your chinese zodiac is Cockerel");
        }
        else if(birthYear % 12 == 2)
        {
            System.out.println("Your chinese zodiac is Dog.");
        }
        else if(birthYear % 12 == 3)
        {
            System.out.println("Your chinese zodiac is Pig.");
        }        
        else if(birthYear % 12 == 4)
        {
            System.out.println("Your chinese zodiac is Mouse.");
        }
        else if(birthYear % 12 == 5)
        {
            System.out.println("Your chinese zodiac is Ox.");
        }
        else if(birthYear % 12 == 6)
        {
            System.out.println("Your chinese zodiac is Tiger.");
        }
        else if(birthYear % 12 == 7)
        {
            System.out.println("Your chinese zodiac is Rabbit.");
        }
        else if(birthYear % 12 == 8)
        {
            System.out.println("Your chinese zodiac is Dragon.");
        }
        else if(birthYear % 12 == 9)
        {
            System.out.println("Your chinese zodiac is Snake.");
        }
        else if(birthYear % 12 == 10)
        {
            System.out.println("Your chinese zodiac is Horse.");
        }
        else if(birthYear % 12 == 11)
        {
            System.out.println("Your chinese zodiac is Sheep.");
        }
    }
}
