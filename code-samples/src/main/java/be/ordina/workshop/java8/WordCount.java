package be.ordina.workshop.java8;

import java.util.HashMap;


public class WordCount {


    public HashMap<String,Integer> wordCount(String input){



        String[] parts = input.split(" ");
        HashMap<String, Integer> rightOn = new HashMap<>();

        int counter = 1;
        int number = 0;

       while(counter<parts.length+1) {

            for (int i = 0; i < parts.length; i++) {

                if (counter == parts[i].length()) {
                    number++;
                    if(rightOn.get(counter+" letters")!=null){
                        rightOn.replace(counter+" letters",number);
                    }else {
                        rightOn.put(counter + " letters", number);
                    }
                }
            }
           number=0;
           counter++;
        }

        return rightOn;


    }

    public static void main(String args[]){


    }



}
