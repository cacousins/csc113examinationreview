/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationreview;

import java.util.Scanner;

/**
 *
 * @author cacousins
 */
public class ExamMaximumValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the end user to enter the first number
        System.out.print("Enter integers : 0 to exit : ");
        int userInput = input.nextInt();
        int maximumValue = userInput;

        //a counter to keep track of the max value        
        int count = 1;

        while (userInput != 0) {
            System.out.print("Enter integers : 0 to exit : ");
            userInput = input.nextInt(); //read the next number from the key

            if (userInput > maximumValue) {
                maximumValue = userInput;
                count = 1;
            } else if (userInput == maximumValue) {
                count++;
            }

        }

        System.out.println("The largest number is "
                + maximumValue + " and the occurence of the "
                + " largest number is "
                + count + " times ");
    }

}
