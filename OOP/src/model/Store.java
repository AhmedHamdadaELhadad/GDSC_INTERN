package model;

import java.util.ArrayList;

public class Store {

    public ArrayList<LibraryItem> libraryItems;
    public Store() {
        libraryItems = new ArrayList<>();
    }

    public void addLibraryItem(LibraryItem libraryItem) {
        libraryItems.add(libraryItem);
    }

    public void updateLibraryItem(int index, LibraryItem newLibaryItem) {
        if (index >= 0 && index < libraryItems.size()) {
            libraryItems.set(index, newLibaryItem);
        } else {
            System.out.println("invalid index");
        }
    }

    public void deleteLibraryItem(int index) {
        if (index >= 0 && index < libraryItems.size()) {
            libraryItems.remove(index);
        } else {
            System.out.println("invalid index");
        }
    }

    // display all items in inventory
    public void displayLibraryItem() {
        for (LibraryItem item  : libraryItems) {
            if (item instanceof Books) {
                Books book = (Books) item;
                book.displayInfo();
            }
        }
    }

























}
