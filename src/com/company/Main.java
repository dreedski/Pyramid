package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //pyramid pmid = new pyramid();
        //^^^^ pyramid() needs an argument?

        Scanner in = new Scanner(System.in);

        System.out.print("How many rows do you want in your pyramid: 1-10? ");
        int numRows = in.nextInt();
        if (numRows < 1 || numRows > 10){ // || is an or operator
            System.out.println("ERROR: Number must be greater than zero and less than 11");

        } else {
            pyramid pmid = new pyramid(numRows);
        }


    }
}
