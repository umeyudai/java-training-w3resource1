package com.umeyudai;

import java.util.Scanner;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;

public class Exercise {
    public static void main(String[] args) {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello \n" + fname + " " + lname);
        input.close();
    }
}
