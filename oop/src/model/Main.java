package model;
import model.Store;
import model.Books;
import java.time.LocalDate;

public class Main {
    public static void main(String[]   args){

        Books books=new Books("How to Learn c++", LocalDate.of(2022,12,22),"Ancla bob",200,true);

        Store store=new Store();
        store.addLibraryItem(books);
        store.displayLibraryItem();




















    }

}
