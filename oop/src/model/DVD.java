package model;

import java.time.LocalDate;

public class DVD extends LibraryItem{


    private static int dvdID=1;
    private String director;
    private String genre;

    public DVD(String title, LocalDate publishYear, String director, String genre) {
        super(title, publishYear);
        this.director = director;
        this.genre = genre;
        dvdID++;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public static Integer getDvdId() {
        return dvdID;
    }



    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", publishYear=" + publishYear +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public void displayInfo() {
        toString();
    }
}
