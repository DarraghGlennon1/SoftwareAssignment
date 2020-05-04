/*
Program Name: Exercise3

Variables/Types: List variables and types here

Inputs: yes/no

If/else statements: yes/no

Loops: yes/no

Loop how many times: fixed / unknown / not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Exercise3{
  public static void main(String[] args){



    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

	  int age = 19;
	  int number = 0;

	  System.out.println("Enter a number: "+number);
	  number = input.nextInt();

     if(age > number){
		System.out.println("Number Entered is less than my age");
	}else if(number > age){
		System.out.println("Number entered is greater than my age" );
}	else{
        System.out.println("Number entered is equal to my age");
	}
    //Declare variables/types
    //Add code here for Inputs, if/else statements, loops
   }
}