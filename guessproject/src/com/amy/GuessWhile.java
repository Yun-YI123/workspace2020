package com.amy;
import java.util.Random;
import java.util.Scanner;

	public class GuessWhile {
	    public static void main(String[] args) {
	        Random random = new Random();
	        int secret = random.nextInt(10)+1;
	        System.out.println("Please enter a  number(1-10):");
	        while (true){
	            Scanner scanner = new Scanner(System.in);
	            int guess_num = scanner.nextInt();
	            if( guess_num < secret){
	                System.out.println("bigger");
	            }else if (guess_num > secret){
	                System.out.println("smaller");
	            }else{
	                System.out.println("correct");
	                break;
	            }
	        }
	    }
	}


