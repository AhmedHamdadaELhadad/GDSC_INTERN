package model;

import java.time.LocalDate;

public class Magazine extends LibraryItem{


    private static int magazineId=1;
    private String publisher;
    public String category;

    public Magazine(String title, LocalDate publishYear, String publisher, String category) {
        super(title, publishYear);
        this.publisher = publisher;
        this.category = category;
        magazineId++;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public static Integer getMagazineID() {
        return magazineId;
    }



    @Override
    public void displayInfo() {
        System.out.println("Title: " +super.title);
        System.out.println("Author: " + publisher);
        System.out.println("Year: " + super.publishYear);
        System.out.println("Pages: " + category);
    }





    }

