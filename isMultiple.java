/*   
 *  Multiple.java
 *  Carrie Ward 08/28/2017
 *  A simple JAVA program that determines if one number is a multiple of another number.
 */


import javax.swing.JOptionPane;

public class isMultiple {
    public static void main( String args[] ) {
    
    String firstNumber;     // first string entered by user
    String secondNumber;    // second string entered by user
   
    int number1;
    int number2;

    // read in first and second number from user as a string datatype
    firstNumber =  JOptionPane.showInputDialog( "Enter first number: " );
    secondNumber = JOptionPane.showInputDialog( "Enter second number: " );

    // convert numbers from type String to integer type
    number1 = Integer.parseInt( firstNumber );
    number2 = Integer.parseInt( secondNumber );

    // calculations: verify if the first number is a multiple of the second number
    if(number1 % number2 == 0)
        // display the results
        JOptionPane.showMessageDialog(null, "\nYes, the first number is multiple of the second number", "Results",JOptionPane.PLAIN_MESSAGE );
    else
        JOptionPane.showMessageDialog(null, "\nNo, the first number is NOT a multiple of the second number", "Results",JOptionPane.PLAIN_MESSAGE );

    System.exit( 0 );   // terminate application}  

    }
}