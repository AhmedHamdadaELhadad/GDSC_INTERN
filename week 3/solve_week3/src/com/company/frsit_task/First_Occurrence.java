package com.company.frsit_task;



import java.util.Scanner;

class FirstOccurrence<frsit> {


    static int getSizeArray(){
        System.out.println("Enter The Size of Araay");
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
    static int findNumber(){
        System.out.println("Enter The Find Number of Araay");
        Scanner scanner=new Scanner(System.in);
        int find =scanner.nextInt();
        return find;
    }
    static int frsirtOccuranceArray( int[] arr , int find){

        int postion=0;

        for ( int i=0;i<arr.length;++i) {

            if(arr[i]==find && i>5){

                postion= i+1;
                break;

            }
        else if (arr[i]==find && i<5)
            {
                postion= i+1;
                continue;

            }

        }
        return postion;
        }



    static void printOccurance(int positon, int findNumber ){
        if(positon==0)
             System.out.println("Sorry Not Found This Number "+ findNumber +" In Array ");
        else if (positon<5&&positon!=0)
            System.out.println("Unlukily Found This Number  "+ findNumber +"  In Position is "+positon);
        else
            System.out.println("Well Done Found this Number "+findNumber+" In Position is "+positon);
    }


    public static void main(String[] args) {


        int size =getSizeArray();
       int[] arr= vauleOfArray(size);
       int find =findNumber();
       int frsit =frsirtOccuranceArray(arr,find);
        printOccurance(frsit,find);


}}
