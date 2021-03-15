package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        try{
            Coordinates XY = new Coordinates(5, 8);
            System.out.println(XY.toString());
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
