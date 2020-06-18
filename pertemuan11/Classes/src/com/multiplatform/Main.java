package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // Class & Object
        Car toyota = new Car();
        toyota.setModel("Agya");
        System.out.println("Model is " + toyota.getModel());

        Car daihatsu = new Car();
        daihatsu.setModel("Xenia");
        System.out.println("Model is " + daihatsu.getModel());

        Car mitsubishi = new Car();
        mitsubishi.setModel("Pajero");
        System.out.println("Model is " + mitsubishi.getModel());

    }
}