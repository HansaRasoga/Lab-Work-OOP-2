import java.util.Scanner;
// This class represents a date with day, month, and year attributes
// It includes methods to input and print the date
public class Date {
    private int day;
    private int month;
    private int year;

    // Method to input date details from the user
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        day = sc.nextInt();
        System.out.print("Enter month: ");
        month = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leaks
    }

    // Method to print the date in a formatted way
    public void print() {
        System.out.println("Date: "+ day+"/"+ month+"/"+ year);
    }

    public void printFormate1()
    {
        System.out.println("Date (Print formate 1:): "+ day+"."+ month+"."+ year);
    }

    public void printFormate2()
    {
        String S;
        if(day%10==1)
        {
            S = "st";
        }
        else if(day%10==2)
        {
            S = "nd";
        }
        else if(day%10==3)
        {
            S = "rd";
        }
        else if(day >=11 && day <= 13)
        {
            S = "th"; // Special case for 11th, 12th, and 13th
        }
        else if(day%10 >= 4 && day%10 <= 9)
        {
            S = "th"; // For all other cases
        }
        else
        {
            S = "th";
        }

        String monthName="";
        switch(month) {
            case 1: monthName = "January"; 
            break;
            case 2: monthName = "February"; 
            break;
            case 3: monthName = "March"; 
            break;
            case 4: monthName = "April"; 
            break;
            case 5: monthName = "May"; 
            break;
            case 6: monthName = "June"; 
            break;
            case 7: monthName = "July"; 
            break;
            case 8: monthName = "August"; 
            break;
            case 9: monthName = "September"; 
            break;
            case 10: monthName = "October"; 
            break;
            case 11: monthName = "November"; 
            break;
            case 12: monthName = "December"; 
            break;
            default: monthName = "Invalid Month"; // Handle invalid month
        }

        System.out.println("Date (Print formate 2): " + day + S+" " + monthName+" " + year);
    }
    
    // Main method to test the Date class
    public static void main(String[] args) {
        Date date = new Date(); // Create an instance of Date
        date.input();           // Call the input method to read date details
        date.print();          // Call the print method to display the date
        date.printFormate1();  // Call the printFormate1 method to display the date in another format
        date.printFormate2();  // Call the printFormate2 method to display the date in a formatted way
    }

}
