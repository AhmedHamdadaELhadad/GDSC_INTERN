package solvetask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FristException {
    public static void main(String ...arg){

        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter Frist Number : ");
            int num1=scanner.nextInt();
            System.out.println("Enter Second Number : ");

            int num2=scanner.nextInt();
            int sum=num1+num2;
            System.out.println("SUM Of "+num1 +" + "+num2 +" = "+sum);
          }
     catch (InputMismatchException inputMismatchException){
         System.err.println(inputMismatchException);
            System.err.println("Please Enter Number :");


     }



    }
}
