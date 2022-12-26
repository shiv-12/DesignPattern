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
public interface BookSearcher {
    
    public List<BookCopy> search();
    
}
