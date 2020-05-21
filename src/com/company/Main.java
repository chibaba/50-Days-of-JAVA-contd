package com.company;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LocalDateTime localDateTime = LocalDateTime.now();
        DayOfWeek day = localDateTime.getDayOfWeek();
        System.out.println("The week day is :  " + day);
    }
}
