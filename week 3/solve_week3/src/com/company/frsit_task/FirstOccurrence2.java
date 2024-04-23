package com.company.frsit_task;


import java.util.Scanner;

/**
 * Anthor Soultion
 */

public class FirstOccurrence2 {


    public static void main ( String[] args ) {

        System.out.println ( "Enter The Size of Araay" );
        Scanner scanner = new Scanner ( System.in );
        int size = scanner.nextInt ( );
        System.out.println ( "Enter " + size + " Vaule of Array  " );
        int arr[] = new int[ size ];
        for ( int i = 0 ; i < size ; ++ i ) {
            arr[ i ] = scanner.nextInt ( );
        }
        System.out.println ( "Enter Number Found In Array  " );
        int found = scanner.nextInt ( );
        for ( int i = 0 ; i < size ; ++ i ) {
            if (arr[ i ] == found && i < 5)
                continue;
            else if (arr[ i ] == found && i > 5)
                System.out.println ( "The Index Of  " + found + " is " + i + 1 );
            else {
                System.out.println ( "Not Found " + found + " In Array " );
            }

        }


    }
}
