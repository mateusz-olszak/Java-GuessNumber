package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(11) + 1;
        boolean play_again = false;
        do {
            System.out.println("Please enter the number in range 1-10 and get the results, whether you picked the proper number: ");
            int x = input.nextInt();
            if (x != rand) {
                System.out.println("That's ain't correct one");
            }
            while (x != rand) {
                if (x < 1 || x >= 10) {
                    System.out.println("That's ain't number in range 1-10.");
                }
                System.out.println("Please enter the number in range 1-10 and get the results, whether you picked the proper number: ");
                x = input.nextInt();
                if (x == rand) {
                    System.out.println("That's correct! Congratualtions :)");
                    System.out.println("Would you like to play again ? [true/false] ");
                    play_again = input.nextBoolean();
                    rand = random.nextInt(11)+1;
                }
                if (x != rand) {
                    System.out.println("That's ain't correct one");
                }
            }
        }while (play_again);
    }
}

