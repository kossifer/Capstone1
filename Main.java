package com.kg;

import java.io.FileWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Home Screen");
        System.out.println("D) Add Deposit");
        System.out.println("P) Make Payment");
        System.out.println("L) Ledger");
        System.out.println("X) Exit");

        System.out.println("Enter a choice");
        String choice = scanner.nextLine();

        choice = scanner.nextLine();
        switch (choice) {

            case "D":
                // Make deposit
                break;

            case "P":
                // Make payment
                break;

            case "L":
                // ledger
                break;
            case "X":
                break;

            default:
                System.out.println("Not a Valid Choice ");
        }


        {
            switch (choice.toUpperCase()) {

                case "D":
                    System.out.println("Enter the deposit details");

                    System.out.println("Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();

                    System.out.println("Time (HH:MM:SS): ");
                    String time = scanner.nextLine();

                    System.out.println("Description: ");
                    String description = scanner.nextLine();

                    System.out.println("Vendor: ");
                    String vendor = scanner.nextLine();

                    System.out.println("Amount: ");
                    double amount = scanner.nextDouble();

                    try {
                        FileWriter csvWriter = new FileWriter("transactions.csv", true);
                        csvWriter.append(date + "|" + time + "|" + description + "|" + vendor + "|" + (-amount) + "\n");
                        csvWriter.flush();
                        csvWriter.close();

                        System.out.println("saved successfully");

                    } catch (Exception e) {
                        System.out.println("Error saving to file");
                        scanner.close();

                    }





                case "p":
                    System.out.println("Enter card details");

                    System.out.println("Date (YYYY-MM-DD): ");
                    date = scanner.nextLine();

                    System.out.println("Time (HH:MM:SS); ");
                    time = scanner.nextLine();

                    System.out.print("Description: ");
                    description = scanner.nextLine();

                    System.out.println("Vendor: ");
                    vendor = scanner.nextLine();

                    System.out.println("Amount: ");
                    amount = scanner.nextDouble();

                    try {
                        FileWriter csvWriter = new FileWriter("transactions.csv", true);
                        csvWriter.append(date).append("|").append(time).append("|").append(description).append("|").append(vendor).append("|").append(String.valueOf(-amount)).append("\n");
                        csvWriter.flush();
                        csvWriter.close();

                    } catch (Exception e) {
                        System.out.println("Error");
                    }

                    scanner.nextLine();
                    break;
                case "L":
                break;
                case "X":
                System.out.println("Exiting");
                break;
                default:
                System.out.println("Invalid choice.");
                scanner.close();
                {

                }
            }
        }


    }
}