package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BigInteger mult = BigInteger.valueOf(1);


        for(int i = 2;i <= 200;i++){
            mult = mult.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("Answer is " + mult);

    }
}
