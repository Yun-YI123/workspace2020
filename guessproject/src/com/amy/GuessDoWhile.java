package com.amy;

import java.util.Random;
import java.util.Scanner;

public class GuessDoWhile {

	public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        int count = 0;
        int guess_num = 0;
        System.out.println("Please enter a  number(1-10):");
        do {
            count++;
            Scanner scanner = new Scanner(System.in);
            guess_num = scanner.nextInt();
            if( guess_num < secret){
                System.out.println("bigger");
            }else if (guess_num > secret){
                System.out.println("smaller");
            }
        }while(guess_num != secret);
        System.out.println("correct, the number is "+guess_num);
        System.out.println("You guess "+count+" times");
    }

}
