/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraymanagementdesign;

/**
 *
 * @author HP
 */
public class AddBook implements AddIteamsIntoLibrary {

    private final BookCopy bookCopy;

    public AddBook(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    @Override
    public void addItems() {
       // Code for adding book inside the databse 
    }
    

}
