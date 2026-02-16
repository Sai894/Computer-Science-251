import java.util.Scanner;

public class SMouseDriver
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);

        SMouse mighty = new SMouse();
        SMouse mickey = new SMouse();

        int mightyAge;
        int mickeyAge;



        System.out.println("Enter Mighty's age: ");
        mightyAge = stdIn.nextInt();
        for(int i = 0; i < mightyAge; i++) {
            mighty.grow();
        }

        System.out.println("Enter Mickey's Age: ");
        mickeyAge = stdIn.nextInt();
        for(int i = 0; i < mickeyAge; i++) {
            mickey.grow();
        }

        System.out.println("Here is the results: ");
        mighty.display();
        mickey.display();

        stdIn.close();
    }
}
