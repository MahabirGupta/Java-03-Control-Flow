package com.generation.java;
import java.util.Scanner;
public class Main {
    public static boolean businessHours(int dayNumber, int hourNumber) {
        if ((dayNumber >= 0 && dayNumber <= 5) && (hourNumber >= 9 && hourNumber <= 18)) {

            return true;
        } else {
            return false;
        }
    }
    public static int getDayNumber(int yearDayNumber) {

        int dayofweek = yearDayNumber % 7;
        return dayofweek;


    }
    public static boolean overAllbusinessHours(int yearDayNumber1, int time) {
        int dayofweek1 = yearDayNumber1 % 7;
        if ((dayofweek1 >= 0 && dayofweek1 <= 5) && (time >= 9 && time <= 18)) {

            return true;
        } else {
            return false;
        }
    }

        public static void main(String[]args){
         boolean results ;
            boolean newresults;
            int dayofweek;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter day number: ");
            int dayNumber = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the time: ");
            int hourNumber = sc.nextInt();
            results= businessHours(dayNumber, hourNumber);
            if(results) {
                System.out.println("It is during business hours");
            }
            else {
                System.out.println("Sorry it is not during business hours");
            }
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the day number of the year: ");
            int yearDayNumber = sc.nextInt();
            dayofweek = getDayNumber(yearDayNumber);
            System.out.println("It is Day: " + dayofweek);
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter the day number of the year: ");
            int yearDayNumber1 = sc.nextInt();
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Enter the time: ");
            int time = sc.nextInt();
            newresults= overAllbusinessHours(yearDayNumber1, time);
            if(newresults) {
                System.out.println("It is during business hours");
            }
            else {
                System.out.println("Sorry it is not during business hours");
            }
        }
    }





