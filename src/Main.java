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

        // Mortgage Calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        double  principal  =  scanner.nextDouble();

        System.out.print("Annual Interest Rate : ");
        double   interestRate = scanner.nextDouble() / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years) : " );
        double years = scanner.nextDouble() * MONTHS_IN_YEAR;

        double mortgage = principal * interestRate * Math.pow(1 + interestRate, years)
                / (Math.pow(1 + interestRate, years) - 1);

        System.out.println(String.format("Monthly Mortgage Payment: %.2f", mortgage));









    }
}