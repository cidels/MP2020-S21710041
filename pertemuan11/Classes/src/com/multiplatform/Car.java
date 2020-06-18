package com.multiplatform;

public class Car {
    // 2 member dalam class
    //1. Field
    //2. Method

    private String model;
    private int doors;
    private int wheels;
    private String engine;

    //Setter
//    public void setModel(String model){
//        this.model = model;
//    }
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("agya") || validModel.equals("xenia")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }
    //Getter
    public String getModel(){
        return this.model;
    }
}