package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

//write a function that takes in an integer and return an array of the divisors but return
// an empty arraylist if it is a prime number.
public class AlgoMorning {
    public static ArrayList<Integer> divisors(int n) {
        if(n<=1){
            return new ArrayList<Integer>();
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            List <Integer> values = new ArrayList<>();
            if(n%i==0){
                values.add(i);
                return new ArrayList<Integer>(values);
            }
            if (i != n/i){
                values.add(n/i);
            }
        }
        return new ArrayList<Integer>();
    }
    public static void main(String [] args){
        System.out.println(divisors(15));
    }
}

