package model;

import java.time.LocalDate;

public class Books extends LibraryItem{

    private static int bookID=1;
    private String author;
    private Integer intnumberOfPages;
    private boolean isAvabaly;

    public Books(String title, LocalDate publishYear, String author, Integer intnumberOfPages,boolean isAvabaly) {
        super(title, publishYear);
        this.author = author;
        this.intnumberOfPages = intnumberOfPages;
        this.isAvabaly=isAvabaly;
        bookID++;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static Integer getBookID() {
        return bookID;
    }


    public Integer getIntnumberOfPages() {
        return intnumberOfPages;
    }

    public void setIntnumberOfPages(Integer intnumberOfPages) {
        this.intnumberOfPages = intnumberOfPages;
    }

    @Override
    public String toString() {
        return "Books{" +
                ", title='" + title + '\'' +
                "author='" + author + '\'' +
                ", publishYear=" + publishYear +
                ", intnumberOfPages=" + intnumberOfPages +
                '}';
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " +super.title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + super.publishYear);
        System.out.println("Pages: " + intnumberOfPages);
    }



}
