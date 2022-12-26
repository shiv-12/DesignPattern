/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searcher;

import dataaccessor.DBAccessor;
import dataaccessor.Results;
import dataaccessor.ResultsConvertor;
import java.util.List;
import libraymanagementdesign.BookCopy;

/**
 *
 * @author HP
 */
public class NameBasedBookSearcher implements BookSearcher {

    private final String bookName;

    public NameBasedBookSearcher(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public List<BookCopy> search() { 
        DBAccessor dbaccessor = new DBAccessor();
        Results results = dbaccessor.getBooksWithName(bookName);
        List<BookCopy> listOfBookCopies = ResultsConvertor.convertToBookCopy(results);
        return listOfBookCopies;
    }

}
