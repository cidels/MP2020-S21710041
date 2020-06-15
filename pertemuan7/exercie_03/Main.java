package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        toMilesPerHour(75.114);
        System.out.println("valid value : "+ toMilesPerHour(75.114));
        printConversion(75.114);
    }

    public  static  long toMilesPerHour (Double kilometersPerHour){
        if (kilometersPerHour < 0 ){
            return -1;
        }
        return Math.round( kilometersPerHour / 1.609);
    }

    public  static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        long milesPerHours = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHours + " mi/h");
    }

}