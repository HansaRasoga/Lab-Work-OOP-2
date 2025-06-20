public class Name {
    // Class variables to hold name details
    private String firstName;
    private String middleName; // Optional middle name
    private String lastName;

    public void input() {
        // Create a Scanner object to read input from the console
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter middle name (optional, press Enter to skip): ");
        middleName = sc.nextLine();
        System.out.print("Enter last name: ");
        lastName = sc.nextLine();
        // Close the scanner to prevent resource leaks
        sc.close();
    }

    public void print() {
        System.out.println("Full Name: " + firstName +" " + middleName+ " " + lastName);
    }

    public static void main(String[] args) {
        // Create an instance of Name and call input and print methods
        Name name = new Name();
        
        name.input();
        
        name.print();
    }
}
