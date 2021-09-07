package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int hour_start = 11;
        int minute_start = 35;
        int seconds_start = 12;
        int current_hour = 12;
        int current_minutes = 20;
        int current_seconds = 56;
        double past_time = 41712;
        double total_time = 86400;
        double current_time = total_time - past_time;





        System.out.print("Seconds since midnight: ");
        System.out.println((hour_start * 60 * 60) + minute_start * 60 + seconds_start);

        System.out.print("How many seconds is remaining of the day:");
        System.out.println(86400 - ((current_hour * 60 * 60) + (current_minutes * 60 + current_seconds)));

        System.out.print("how much of the day is past in percent: ");
        System.out.print((past_time / total_time) * 100);
        System.out.println("%");

        System.out.print("Time since start: ");
        System.out.print((current_time - past_time)/ 60);
        System.out.print(" minutes past since start");
    }
}
