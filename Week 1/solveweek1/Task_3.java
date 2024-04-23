package solveweek1;

import java.util.Scanner;

public class Task_3 {

    public static String getDayName1(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;
    }
   public static void  getDayName2(int day) {
        if (day ==1)
            System.out.println("Monday ");
        else if (day==2)
            System.out.println("Tuesday ");
        else if (day==3)
            System.out.println("Wednesday ");
        else if (day==4)
            System.out.println("Thursday ");
        else if (day==5)
            System.out.println("Friday ");
        else if (day==6)
            System.out.println("Saturday ");
        else if (day==7)
            System.out.println("Sunday ");
        else
            System.out.println("Invalid day range ");
    }


    public static void main(String ... arg){

        Scanner in = new Scanner(System.in);
        System.out.print("Input number In Rand 1 -7 : ");
        int day = in.nextInt();
        System.out.println("The Soultion With SWITCH ");
        System.out.println(getDayName1(day));
        System.out.println("The soultion With IF - ELSE ");
         getDayName2(day);

    }

}
