package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // Method Overloading -> method memiliki nama sama tetapi berbeda parameter (jumlah, tipe data)
        sum(10,20.30d);
    }
    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
    public static int sum(int a, double b){
        int result = a + (int) b;
        return result;
    }
    public static int sum(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
    public static int sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        return result;
    }
}