/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex29;
import java.util.Scanner;

public class HandlingBadInput {

    static void badInput() {

        String userIn;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter rate of return: ");
        userIn = input.nextLine();

        char[] c = userIn.toCharArray();

        //int rateOfReturn = Integer.parseInt(userIn);

        for(int i = 0; i < userIn.length(); i++) {

            while(Character.isLetter(userIn.charAt(i)) || userIn.charAt(i) == '0') {

                System.out.print("Sorry wrong input. Enter rate of return: ");
                userIn = input.nextLine();

                if(!Character.isLetter(userIn.charAt(i)) || userIn.charAt(i) != '0') {

                    int rateOfReturn = Integer.parseInt(userIn);

                    int calc = 72 / rateOfReturn;

                    if(rateOfReturn > 0) {

                        System.out.print("It will take you " + calc + " years to double your initial investment.");

                    }

                }

            }

        }

    }

    public static void main(String[] args) {

        badInput();

    }

}
