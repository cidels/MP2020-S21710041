package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Maximum Value" + myMaxIntValue);
        System.out.println("Integer Minimum Value" + myMinIntValue);
        //System.out.println("Overflow Max Value" + (myMaxIntValue + 1));
        // System.out.println("Underflow Min Value" + (myMinIntValue - 1));

        //long myMaxLongTest = 2_147_483_647_222L; harus tambah L


        //Assignment#02
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Maximum Value =" + myMaxByteValue);
        System.out.println("Byte Minimum Value =" + myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Maximum Value =" + myMaxShortValue);
        System.out.println("Short Minimum Value =" + myMinShortValue);

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Maximum Value =" + myMaxLongValue);
        System.out.println("Long Minimum Value =" + myMinLongValue);


    }
}
