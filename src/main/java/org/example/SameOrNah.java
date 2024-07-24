package org.example;
import java.util.Scanner;



public class SameOrNah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String firstWord = sc.nextLine();

        System.out.println("Enter the second word: ");
        String secondWord = sc.nextLine();

        if (firstWord.equals(secondWord)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }

        sc.close();
    }
}