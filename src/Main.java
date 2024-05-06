import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // first need to make sure the value is between 1k and 1m, if not have the
        // user type it again.
        // Mortgage Calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        double principal = 0;
        double monthlyInterestRate  = 0;
        double numbersOfPayments = 0;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextDouble();
            if (principal >= 1000 || principal <= 100_000_000)
                break;
            else {
                System.out.println(" enter a value between  1000 and 1000000:");
            }

        }

        while (true) {
            System.out.print("Annual Interest Rate:");
            double annualInterest = scanner.nextDouble();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterestRate = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;

            }
            System.out.println("enter the nu,number between 1 and 30");
        }

        while(true){
            System.out.print("Period (Years) : " );
            double years = scanner.nextDouble();
            if(years >= 1 && years <=30) {
                numbersOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("enter the numbersOfPayments between 1 and 30");

        }


        double mortgage = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numbersOfPayments)
                / (Math.pow(1 + monthlyInterestRate, numbersOfPayments) - 1);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly Mortgage Payment:" + formattedMortgage);




    }
}