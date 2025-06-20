import java.util.Scanner;
public class Length {
    private int Length1;
    private int Length2;

    public void input()
    {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first length: ");
        Length1 = sc.nextInt();
        System.out.print("Enter second length: ");
        Length2 = sc.nextInt();
        // Close the scanner to prevent resource leaks
        sc.close();
    }

    public void print()
    {   
        System.out.println("Length 1: " + Length1);
        System.out.println("Length 2: " + Length2);
    }


    public int Add(int Length1, int Length2) {
        return Length1 + Length2;
    }

    public static void main(String [] ars)
    {
        // Create an instance of Length and call input and print methods
        Length length = new Length();
        
        length.input();
        
        length.print();
        
       int sum= length.Add(length.Length1, length.Length2);
        System.out.println("Sum of lengths: " + sum);
}

}
