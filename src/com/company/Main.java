package com.company;
import java.util.Scanner;

public class Main {
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    };

    public static void main(String[] args) {
        Season season;
        Scanner in = new Scanner(System.in);
        String month = in.nextLine();
        //String month = System.console().readLine();
        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                System.out.println("WINTER");
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                System.out.println("SPRING");
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                System.out.println("SUMMER");
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("No this month");
        }
    }
}

