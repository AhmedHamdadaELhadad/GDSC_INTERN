package model;

import java.time.LocalDate;

public abstract class LibraryItem {

    protected String title;
    protected LocalDate publishYear;

    // Constructor
    public LibraryItem(String title, LocalDate publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }


    @Override
    public String toString() {
        return "LibraryItem{" +
                "publishYear=" + publishYear +
                ", title='" + title + '\'' +
                '}';
    }

    public  void displayInfo(){
        toString();

    };

}
