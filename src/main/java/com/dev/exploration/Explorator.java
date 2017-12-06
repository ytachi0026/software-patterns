package com.dev.exploration;

public class Explorator {

    public static void main(String[] args) {
        Integer test = Integer.valueOf("3");

        Integer.parseInt("2");
        int origin = test;
        System.out.println(origin);

        System.out.println("DOUBLE TREAT");
        float floti = Float.parseFloat("3.15");
        floti = floti * 100;

        origin = (int) floti;
        System.out.println(origin);

        System.out.println(getEntelPaymentAmount("3.66"));
    }

    public static boolean isStringNotEmpty(Object str) {
        return str != null && !"".equals(str);
    }

    public static int getEntelPaymentAmount(String value){
        if(isStringNotEmpty(value)){
            float paymentAmount =  Float.parseFloat(value);
            paymentAmount = paymentAmount * 100;
            return (int) paymentAmount;
        }
        throw new IllegalStateException("El monto a pagar es incorrecto.");
    }

}
