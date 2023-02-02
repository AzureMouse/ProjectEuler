/**
 * File:        ProblemTwo.java
 * Project:     Euler
 * Date:        1/27/23
 * Author:      AzureMouse
 * Description:
 * Problem two of prohect Euler
 * 
 * Problem:
 * Find the sum of all even valued terms of a Fibonacci sequence whose values do not exceed four million
 */


public class ProblemTwo {
    public static void main(String[] args){
        int firstNumber = 0;
        int secondNumber = 1;
        int temp;

        int endPoint = 4000000 ;
        int sum = 0;

        while(secondNumber <= endPoint){
            temp = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;

            if(secondNumber % 2 == 0){
                sum += secondNumber;
            }
        } 

            System.out.println(sum);
    }
}
