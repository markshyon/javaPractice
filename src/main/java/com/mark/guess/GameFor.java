package com.mark.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
        int secret = new Random().nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=4; i++) {
            System.out.print("Please enter a number("+i+"/4): ");
            int number = scanner.nextInt();
            System.out.println("第"+i+"次:"+number);
            if (number > secret) {
                System.out.println("Lower");
            } else if (number < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Great! The number is "+number);
                break;
            }
        }
        System.out.println("End");
    }
}
