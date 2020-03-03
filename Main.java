package com.company;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte YEAR = 12;
        final byte PERCENT = 100;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // Interest Rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / YEAR;

        // Period in Years
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * YEAR;
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
