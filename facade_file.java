import java.util.Scanner;

public class facade_file
{
    public static void main(String[] args)
    {

        Scanner my_scanner = new Scanner(System.in);

        System.out.println("Enter name, age and salary");

        System.out.print("Enter name: ");

            String  name    = my_scanner.nextLine();

        System.out.print("Enter age: ");

            int     age     = my_scanner.nextInt();

        System.out.print("Enter salary: ");

            int     salary  = my_scanner.nextInt();

        System.out.println("Username is: " + name);

        System.out.println("Age is: " + age);

        System.out.println("Salary is: " + salary);
    }
}
