package com.company;

public class Main {

    public static void multadd(double a, double b, double c){
        System.out.println( a * b + c);

    }

    public static void expSum(double x ){
        System.out.println(x * Math.exp(-x) + Math.sqrt(1-Math.exp(-x)));
    }

    public static void main(String[] args) {
        multadd(1.0,2.0,3.0);

        double svara = Math.sin(Math.PI/4);
        double svarb = (Math.cos(Math.PI/4))/2;
        double svaret = svara+svarb;

        System.out.println(svaret);
        System.out.println(Math.log(10)+Math.log(20));
        expSum(1);
    }
}
