package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int hour = 11;
        int minute = 35;
        int seconds = 12;

        System.out.print("Seconds since midnight: ");
        System.out.println((hour * 60 * 60) + minute * 60 + seconds );

        System.out.print("How many seconds is remaining of the day:");
        System.out.print(86400 - ((hour * 60 * 60) + minute * 60 + seconds));


    }
}
