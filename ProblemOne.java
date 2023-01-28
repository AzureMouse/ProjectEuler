/**
 * File:        ProblemOne.java
 * Project:     Project Euler
 * Date:        1/27/23
 * Author:      AzureMouse
 * Description:
 * Problem one of project euler.
 * 
 * Problem: 
 * Find the sum of all the multiples of 3 or 5 below 1000 
 */

public class ProblemOne{
    private static int numOne = 3;
    private static int numTwo = 5;

    /**
     * @param - int x
     * A positive integer 
     * @precondition
     *  x is not a negative number
     * @postconditon
     *  The postcondition has not been violated, and an integer will be returned
     * @throws
     *  Indicates that the precondition has been violated 
     */
    public static int sumMultiples(int number){
        int sum = 0;

        for(int i = 0; i < number; i++){
            if(i % numOne == 0 || i % numTwo == 0){
                sum += i;
            }
        }

        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumMultiples(1000));
    }
}