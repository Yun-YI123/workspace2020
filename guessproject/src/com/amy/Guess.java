package com.amy;
import java.util.Scanner;

public class Guess {

	  public static void main(String[] args) {
	        int secret_num = 77;
	        int min = 1;
	        int max = 100;
	        System.out.println("Guess a number:");
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        if( N < secret_num){
	            System.out.println("bigger");
	            System.out.println("secret number is between "+N+" to "+max);
	        }
	        if(N > secret_num){
	            System.out.println("smaller");
	            System.out.println("secret number is between "+min+" to "+N);
	        }
	    }
}
