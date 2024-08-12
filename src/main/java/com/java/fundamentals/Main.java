package com.java.fundamentals;

import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
                try {
                        Scanner scanner = new Scanner(System.in);  //Generating user input
                        System.out.println("Enter a roman number: ");
                        String input = scanner.nextLine();  //user input of a roman number

                        if (input.isEmpty() || input == null) {  //Error handling for empty input
                                throw new IllegalArgumentException("Input cannot be empty");
                        }

                        int result = Solution.romanToInt(input);   //Error handling for roman input (The input should be String)
                        System.out.println("Integer value: " + result);
                } catch (IllegalArgumentException e) {
                        System.out.println("Invalid input: " + e.getMessage());
                } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());


                }
        }
}