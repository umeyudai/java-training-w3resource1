package com.umeyudai;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = input.nextInt();
        System.out.print("n2 : ");
        int n2 = input.nextInt();

        System.out.println(n1/n2);
        input.close();
    }
}
