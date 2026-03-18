
package edu.wit.scds.cs1.lab02;

import java.util.Scanner ;

/**
 * 
 * 
 * @author Trevor J Grafton
 * @version 1.0.0 2023-10-22 Initial implementation
 *
 */
/**
  */
public class Statistics
    {

    /**
     * 
     * 
     * @param args
     */
    /**
     * 
     * 
     * 
     * @param args
     */
    public static void main( String[] args )
        {
        /* Setting scanner objects to get input values to test*/
        @SuppressWarnings( "resource" )
        Scanner firstNumber = new Scanner (System.in);
        System.out.printf("Enter first number: ");
        double number1 = firstNumber.nextDouble();
        
        @SuppressWarnings( "resource" )
        Scanner secondNumber = new Scanner (System.in);
        System.out.printf( "%n" + "Enter second number: ");
        double number2 = secondNumber.nextDouble();
        
        @SuppressWarnings( "resource" )
        Scanner thirdNumber = new Scanner (System.in);
        System.out.printf( "%n" + "Enter third number: ");
        double number3 = thirdNumber.nextDouble();
        
        @SuppressWarnings( "resource" )
        Scanner fourthNumber = new Scanner (System.in);
        System.out.printf( "%n" + "Enter fourth number: ");
        double number4 = fourthNumber.nextDouble();
        
        @SuppressWarnings( "resource" )
        Scanner fifthNumber = new Scanner (System.in);
        System.out.printf( "%n" + "Enter fifth number: ");
        double number5 = fifthNumber.nextDouble();
        /*Doing appropriate math to solve for sum, mean, and population standard deviation*/
        double mean = ((number1 + number2 + number3 + number4 + number5)/5);
        double standardDeviation = ((Math.pow(number1-mean, 2)) + (Math.pow(number2-mean, 2)) + (Math.pow(number3-mean, 2)) + (Math.pow(number4-mean, 2)) + (Math.pow(number5-mean, 2)));
        double populationStandardDeviation = (Math.sqrt(standardDeviation/5));
        /*Printing out each of the variables to it's correct value*/
        System.out.printf("%n" + "Sum: " + (number1 + number2 + number3 + number4 + number5));
        System.out.printf("%n" + "Mean: " + mean);
        System.out.printf("%n" + "Standard Deviation: " + (Math.round(populationStandardDeviation *100.0)/100.0));
        
        }

    }
   // end class Statistics