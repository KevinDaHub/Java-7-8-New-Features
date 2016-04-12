package be.ordina.workshop.java8;

import java.util.ArrayList;

public class Fibonacci {


    private static Long fibonacci(int number) {

        ArrayList<Long> list = new ArrayList<>();



        if (number == 0) {
            return 0L;
        } else if (number == 1) {

            return 1L;
        }

        if(number>0) {
            list.add(0L);
            list.add(1L);
            list.add(1L);
            for (int i = 3; i <= number; i++) {
                list.add((list.get(i - 1) + list.get(i - 2)));

            }
            return list.get(number);

        }else{
            throw new IllegalArgumentException("The number can only be positive");
        }









    }

    public static void main(String args[]){

        System.out.print(fibonacci(-1));

    }




    }
