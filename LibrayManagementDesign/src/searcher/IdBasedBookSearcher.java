/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searcher;

import java.util.List;
import libraymanagementdesign.BookCopy;

/**
 *
 * @author HP
 */
public class IdBasedBookSearcher implements BookSearcher{
    
    private final int bookCopyId;

    public IdBasedBookSearcher(int bookCopyId) {
        this.bookCopyId = bookCopyId;
    }

    @Override
    public List<BookCopy> search() {
        return null;    // search books which having that perticuler id ;
    }
    
}
