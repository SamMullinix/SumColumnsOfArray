/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Lab:           11
 * Program:       1
 * ProgramName:   SumArrayColumns
 * Purpose:       Purpose is to sum the columns of all the rows in an array
 * Operation:     Program takes entered array, and returns the sum of each column.
 * Input(s):      Take re run and array from user.
 * Output(s):     Output the sum of each row.
 * Methodology:   The program takes in the array, passes the column number and the array to the method, the 
 *                method returns the sum and it is printed to the user and repeated.
 *                
 */       
 

/*******************************************************
//          Import the java utility; Scanner          //
*******************************************************/

import java.util.Scanner;

public class SumArrayColumns
{
   public static void main (String[] args)
   {
      
      /********************************************
      //          Create new Scanner item        //
      ********************************************/
                   
      Scanner input = new Scanner(System.in);
      
      /******************************************************************************
      *                    Declare/Initialize Strings/Charachters                   *
      ******************************************************************************/
   
      String userInput = " ";
      
      /******************************************************************************
      *                              Declare Variables                              *
      ******************************************************************************/ 
      
      int start;
      int count;
      double sum;
      
      /******************************************************************************
      *                           Initialize Variables                              *
      ******************************************************************************/
      
      start = 0;
      count = 0;
      sum = 0;
      
      /******************************************************************************
      *                             Declare Array                                   *
      ******************************************************************************/
      
      double[][] userArray = new double[3][4];
      
      /******************************************************************************
      *                          Calculation Section #1                             *
      ******************************************************************************/
      
      while (start == 0)              // Loop to keep program running as long as user says yes. Initial run is 0.   
      {
      
      /******************************************************************************
      *                                Input Section                                *
      ******************************************************************************/
      
         System.out.println("Enter a " + userArray.length + " by " +
            userArray[0].length + " matrix:\n");
         for (int row = 0; row < userArray.length; row++) 
         {
            for (int column = 0; column < userArray[row].length; column++) 
            { 
               userArray[row][column] = input.nextInt(); // Input.
            } 
         }
         
         /******************************************************************************
         *                                Output Section                               *
         ******************************************************************************/
         
         System.out.println();
         for(count = 0; count < userArray[0].length; count++)
         {
            sum = sumColumn(userArray, count);  // Sum each row.
            System.out.println("Sum of the elements at column " + count + " is " + sum);  // Output
         }
         
         /******************************************************************************
         *                                Re-run Section                               *
         ******************************************************************************/
         
         input.nextLine();         
         System.out.print("\nWould you like to continue program?\t"); // Prompt.
         userInput = input.nextLine();   //Input
         
         if (userInput.equals("no") || userInput.equals("No") || userInput.equals("NO") || userInput.equals("n"))
         {                          // Commands the user could enter to end the program.
            System.out.println("\nThanks for playing!");  // Final statment.   
            start = 1;              // Sets start = to 1 so the program does not run again. Start = 0 will run program again.
         }
         else
         {  
            start = 0;              // Whatever the user inputs is obviously not no, so the program continutes ensuring the
                                    // number that determines if the program runs is 0.
         }
      }
   }

   
/* Method Name: sumColumn
 * Purpose:     The purpose is to return the sum of the column entered.
 * Methodology: Program taker the column index and adds together each number
 *              on that row and returns it.
 */ 

   public static double sumColumn(double[][] m, int columnIndex)
   {
      double sum = 0;
      int row = 0;
      for (row = 0; row < m.length; row++)
      {
         sum = sum + m[row][columnIndex];
      }
      return sum;
   }
}