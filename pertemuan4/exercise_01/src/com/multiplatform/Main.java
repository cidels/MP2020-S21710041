package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 4;
        short myShortValue = 8;
        int myIntValue = 10;
        long myLongValue = (5_000L + 10L) * (myByteValue + myShortValue + myIntValue);

        System.out.println("myLongValue = " + myLongValue);
    }
}
