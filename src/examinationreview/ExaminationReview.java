package examinationreview;

import java.util.Scanner;

public class ExaminationReview {

    public static void main(String[] args) {
        //variable to keep track of the largest value
        int largestNumber;

        Scanner input = new Scanner(System.in);
        //prompt user for four integers
        System.out.println("Please enter four integers : ");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int numberFour = input.nextInt();

        //assign the first integer to be the largest number
        largestNumber = numberOne;

        if (numberTwo > largestNumber) {
            largestNumber = numberTwo;
        }

        if (numberThree > largestNumber) {
            largestNumber = numberThree;
        }

        if (numberFour > largestNumber) {
            largestNumber = numberFour;
        }
        System.out.println("The Largest number is : " + largestNumber);

    }

}
