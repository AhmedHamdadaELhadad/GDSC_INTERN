package solvetask;


import java.io.*;

public class Count {

    public static void main(String ...arg)  throws IOException{


        File file = new File("C:\\Users\\Options\\Desktop\\GDSC INTERN\\Exceptions\\solvetask\\Lincoln.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

           BufferedReader bufferedReader = new BufferedReader(inputStreamReader);



        String line;
        int wordCount = 0;
        int characterCount = 0;


        while ((line = bufferedReader.readLine()) != null) {

            characterCount += line.length();
            String words[] = line.split("\\s+");
            wordCount += words.length;

        }

        System.out.println("Total word count = "+ wordCount);

        System.out.println("Total number of characters = "+ characterCount);






    }}