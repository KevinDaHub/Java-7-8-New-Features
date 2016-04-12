package be.ordina.workshop.java8;

import java.util.Optional;

public class Palindrome {

    public static boolean palindrome(String inputString){
      //  String inputString;
        //Scanner in = new Scanner(System.in);

     //   System.out.println("Input a string");
      //  inputString = in.nextLine();

        if(inputString.isEmpty()){
           throw new IllegalArgumentException("boom");
        }
        String opString = Optional.of(inputString.toLowerCase()).orElseThrow(NullPointerException::new);

            String reverseString = "";

            for(int i = inputString.length()-1; i>=0; i--){
                reverseString += inputString.charAt(i);
            }

            System.out.print(reverseString.equals(inputString));
            return true;



    }
    public static void main(String args[]){

    palindrome(null);


    }




}
