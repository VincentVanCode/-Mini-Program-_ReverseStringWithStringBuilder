package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        StringBuilder initialString = new StringBuilder();

        //append a string into StringBuilder initialString
        initialString.append(string);

        //reverse StringBuilder initialString
        initialString = initialString.reverse();

        //print the reversed string
        System.out.println(initialString);

    }
}
