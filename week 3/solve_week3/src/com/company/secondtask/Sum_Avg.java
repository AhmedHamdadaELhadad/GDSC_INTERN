package com.company.secondtask;

;
import java.util.Scanner;



public class Sum_Avg {


    static int getSizeArray(){
        System.out.println("Enter The Size of Array");
        Scanner scanner=new Scanner(System.in);
        int size =scanner.nextInt();
        return size;
    }
    static int[] vauleOfArray ( int n ) {
        System.out.println ( "Enter " + n + " Vaule of Array  " );
        Scanner scanner = new Scanner ( System.in );
        int arr[] = new int[ n ];
        for ( int i = 0 ; i < n ; ++ i ) {
            arr[ i ] = scanner.nextInt ( );
        }
        return arr;
    }

    static int findSum1(int[] arr ){
        int sum=0;
        for (int s :arr) {
            sum+=s; }
        return sum;
    }
    static int findAvg1(int[] arr ){
        int sum=0;
        for (int s :arr) {
            sum+=s; }
        return (sum/arr.length);
    }

/*
    public static int findSum2(Integer[] array) {
        return Arrays.stream(array)
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static double findAvg2(int[] array) {
    return Arrays.stream(array).average().orElse(Double.NaN);
}
*/
    public static void main(String... arStrings) {


        int size = getSizeArray ( );
        int[] arr = vauleOfArray ( size );
        int sum = findSum1 ( arr );
        System.out.println ( "The Sum of Array is " + sum );
        int avg = findAvg1 ( arr );
        System.out.println ( "The Avg of Array is " + avg );


/*
        System.out.println ( "**********************************************************" );
        System.out.println ( " Soultion with Stream  " );
            sum= findSum2 ( arr );
        System.out.println ( "The Sum of Array is "+ sum );
         avg= findAvg2 ( arr );
        System.out.println ( "The Avg of Array is "+ avg );
*/


    }}


