package com.company;

public class TryCatchMain {
    public static void main(String[] args) {
        try{
            int i = 5/5;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Cierre de recursos");
        }


        System.out.println("fin");
    }
}
