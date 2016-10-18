package com.company;

public class Main {

    public static void main(String[] args) {
        //public String trim()
        //.trim() will remove leading and trailing whitespace in Strings
        // it DOES NOT remove white space within a String though


        //.trim() is only applicable to Strings
        //it has no parameter

        //to call it you simply use .trim()
        // no need for a parameter in the parenthesis

            String dog = new String("       I like dogs       ");
            System.out.println("Without trim:");
            System.out.println("aaaaaaaa" + dog + "aaaaaaaaa \n");
            System.out.println("With trim:");
            System.out.println("aaaaaaaa" + dog.trim() + "aaaaaaaa \n");

        System.out.println("See the difference");
    }
}
