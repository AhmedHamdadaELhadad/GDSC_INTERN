package solveweek1;

import java.util.Scanner;

public class Task_2 {

    static double sum(double num1,double num2){
        System.out.println("The Sum Of "+num1+ " + "+num2 +" = ");
        return num1+num2;
    }
    static double difference(double num1,double num2){
        System.out.println("The Difference Of "+num1+ " - "+num2 +" = ");
        return num1-num2;
    }
    static double product(double num1,double num2){
        System.out.println("The Droduct Of "+num1+ " * "+num2 +" = ");
        return num1*num2;
    }
    static double division(double num1,double num2){
        if( num2==0){

            System.out.println("Not Allowed  Dividing by Zero  ");
            System.exit(0);
        }

        System.out.println("The Division Of "+num1+ " / "+num2 +" = ");
        return num1/num2;
    }





    public static void main(String ... arg){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Frist Number ");
        double num1=scanner.nextDouble();
        System.out.println("Enter Seccond Number ");
        double num2=scanner.nextDouble();

        System.out.println(sum(num1,num2));
        System.out.println(difference(num1,num2));
        System.out.println(product(num1,num2));
        System.out.println(division(num1,num2));








    }
}
