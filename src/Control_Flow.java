import java.util.Scanner;

public class Control_Flow {
    Scanner sc = new Scanner(System.in);
    //Task 1:

    /**
     * Write a program that declares 1 integer variable x,
     * and then assigns 7 to it.
     * Write an if statement to print out “Less than 10” if x is less than 10.
     * Change x to equal 15, and notice the result (console should not display anything).
     */

    public void ifDemo() {
        int x = 7;

        if (x < 10) {
            System.out.println("Less than 10");
        }
        x = 15;
    }

    /**
     * Task 2:Write a program that declares 1 integer variable x,
     * and then assigns 7 to it.
     * Write an if-else statement that prints out “Less than 10” if x is less than 10,
     * and “Greater than 10” if x is greater than 10.
     * Change x to 15 and notice the result.
     */
    public void ifElseDemo2() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    /**
     * Write a program that declares 1 integer variable x,
     * and then assigns 15 to it.
     * Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
     * “Between 10 and 20” if x is greater than 10 but less than 20,
     * and “Greater than or equal to 20” if x is greater than or equal to 20.
     * Change x to 50 and notice the result.
     */
    public void ifElseIFDemo3() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if ((x >= 10) && x < 20) {
            System.out.println("X is Greater than 10 but less than 20 ");
        } else {
            System.out.println("X is Greater than 20 or equal to 10");
        }
    }

    /**
     * Write a program that declares 1 integer variable x,
     * and then assigns 15 to it.
     * Write an if-else statement that prints “Out of range”
     * if the number is less than 10 or greater than 20
     * and prints “In range”
     * if the number is between 10 and 20 (including equal to 10 or 20).
     * Change x to 5 and notice the result.
     */
    public void ifElseIFDemo4() {
        int x = 15;
        if (x < 10) {
            System.out.println("Out of range");
        } else if ((x >= 10) || x < 20) {
            System.out.println("Out of range or equal to 20");
        } else {
            System.out.println("In range");
        }
    }

    /**
     * Write a program that uses if-else-if statements
     * to print out grades A, B, C, D, F, according to the following criteria:
     * A: 90-100
     * B: 80-89
     * C: 70-79
     * D: 60-69
     * F: <60
     * Use the Scanner class to accept a number score from the user
     * to determine the letter grade.
     * Print out “Score out of range” if the score is less than 0 or greater than 100.
     */
    public void ifElseIFDemo5() {

        System.out.println("Enter number");
        int a = sc.nextInt();
        if (a >= 90 && a <= 100) {
            System.out.println("A");
        } else if (a >= 80 && a <= 89) {
            System.out.println("B");
        } else if (a >= 70 & a <= 79) {
            System.out.println("C");
        } else if (a >= 60 && a <= 69) {
            System.out.println("D");
        } else if (a < 59) {
            System.out.println("F");
        } else if (a < 0 || a > 100) {
            System.out.println("Out of range");
        }
    }

    /**
     * Write a program that accepts an integer between 1 and 7 from the user.
     * Use a switch statement to print out the corresponding weekday.
     * Print “Out of range” if the number is less than 1 or greater than 7.
     * Do not forget to include “break” statements in each of your cases.
     */
    public void SwitchDemo() {
        System.out.println("Enter the number between 1 and 7");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Day 1");
                break;
            case 2:
                System.out.println("Day 2");
                break;
            case 3:
                System.out.println("Day 3");
                break;
            case 4:
                System.out.println("Day 4");
                break;
            case 5:
                System.out.println("Day 5");
                break;
            case 6:
                System.out.println("Day 6");
                break;
            case 7:
                System.out.println("Day 7");
                break;
            default:
                System.out.println("Out of range");
        }
    }

    /**
     * Create a program that lets the users input their filing status and income.
     * Display how much tax the user would have to pay according to status and income.
     * The U.S. federal personal income tax is calculated based on the filing status and taxable income.
     * There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
     * The tax rates for 2009 are shown below.
     */
    public void taxDemo() {


        Scanner scanner = new Scanner(System.in);

        // Prompt user for filing status
        System.out.println("Enter your filing status:");
        System.out.println("1. Single");
        System.out.println("2. Married Filing Jointly or Qualifying Widow(er)");
        System.out.println("3. Married Filing Separately");
        System.out.println("4. Head of Household");
        System.out.print("Enter the number corresponding to your filing status: ");
        int status = sc.nextInt();

        // Prompt user for taxable income
        System.out.print("Enter your taxable income: ");
        double income = sc.nextDouble();

        double tax = 0;

        // Calculate tax based on filing status and income
        switch (status) {
            case 1: // Single
                if (income <= 8350) tax = income * 0.10;
                else if (income <= 33950) tax = 835 + (income - 8350) * 0.15;
                else if (income <= 82250) tax = 4675 + (income - 33950) * 0.25;
                else if (income <= 171550) tax = 16750 + (income - 82250) * 0.28;
                else if (income <= 372950) tax = 41850 + (income - 171550) * 0.33;
                else tax = 108216 + (income - 372950) * 0.35;
                break;

            case 2: // Married Filing Jointly or Qualifying Widow(er)
                if (income <= 16700) tax = income * 0.10;
                else if (income <= 67900) tax = 1670 + (income - 16700) * 0.15;
                else if (income <= 137050) tax = 9350 + (income - 67900) * 0.25;
                else if (income <= 208850) tax = 26600 + (income - 137050) * 0.28;
                else if (income <= 372950) tax = 46750 + (income - 208850) * 0.33;
                else tax = 101086 + (income - 372950) * 0.35;
                break;

            case 3: // Married Filing Separately
                if (income <= 8350) tax = income * 0.10;
                else if (income <= 33950) tax = 835 + (income - 8350) * 0.15;
                else if (income <= 68525) tax = 4675 + (income - 33950) * 0.25;
                else if (income <= 104425) tax = 13300 + (income - 68525) * 0.28;
                else if (income <= 186475) tax = 23375 + (income - 104425) * 0.33;
                else tax = 50543 + (income - 186475) * 0.35;
                break;

            case 4: // Head of Household
                if (income <= 11950) tax = income * 0.10;
                else if (income <= 45500) tax = 1195 + (income - 11950) * 0.15;
                else if (income <= 117450) tax = 6227 + (income - 45500) * 0.25;
                else if (income <= 190200) tax = 24096 + (income - 117450) * 0.28;
                else if (income <= 372950) tax = 42170 + (income - 190200) * 0.33;
                else tax = 110778 + (income - 372950) * 0.35;
                break;

            default:
                System.out.println("Invalid filing status entered.");
                sc.close();
                return;
        }

        // Display the tax amount
        System.out.printf("Your tax amount is: $%.2f%n", tax);
        sc.close();
    }
}





