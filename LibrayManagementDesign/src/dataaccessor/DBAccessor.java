/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccessor;

import java.util.List;
import libraymanagementdesign.BookCopy;

/**
 *
 * @author HP
 */
public class DBAccessor {

    // instance variable for databse 
    public Results getBooksWithName(String bookName) {
        return new Results();
    }

    public void insertBookCopy(BookCopy bookCopy) {
        // insert book inside the databse ;
    }

    public Results getBorrower(BookCopy bookCopy) {
        return null;
    }

}
