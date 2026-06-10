import java.util.*;
public class Assignment {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        // Tells whether you have fever or not 
        System.out.println("Enter your body temperature in Celsius to check if you have fever or not:");
        double temperature = sc.nextDouble();
        if(temperature > 37.5){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You don't have fever");
        }

        //Tells the day of week based on the number entered by the user
        System.out.println("Enter a number between 1 to 7 to know the day :");
        int dayNumber = sc.nextInt();
        switch(dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        //Check the output
        int a=63,b=36; 
        boolean x= (a<b)?true:false;
        int y= (a>b)?a:b;
        System.out.println(x);

        // Check the leap year 
        System.out.println("Enter the year to check for leap year:");
        int year = sc.nextInt();
        if(year%4 == 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}