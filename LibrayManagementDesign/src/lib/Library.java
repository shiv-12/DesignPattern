/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import dataaccessor.DBAccessor;
import dataaccessor.Results;
import dataaccessor.ResultsConvertor;
import java.util.List;
import libraymanagementdesign.BookCopy;
import user.Member;

/**
 *
 * @author HP
 */
public class Library {

    // this is the Bussiness Layer
    // Here we are creating lots of method which take business object 
    
    private final DBAccessor dbAccessor = new DBAccessor();
     
    public void addBookCopy(BookCopy bookCopy) {

        // first validate arguments
       
        dbAccessor.insertBookCopy(bookCopy);

    }

    public void deleteBookCopy(BookCopy bookCopy) {

    }

    public void blockMember(Member member) {

    }

    public void issueBook(BookCopy bookCopy, Member member) {

    }

    public void submitBook(BookCopy bookCopy, Member member) {

    }

    public Member getBorrower(BookCopy bookCopy) {
        DBAccessor dbAccessor = new DBAccessor();
        Results results = dbAccessor.getBorrower(bookCopy);
        Member member = ResultsConvertor.convertToSingleMember(results);
        return member;
    }

    public List<BookCopy> getBorrowedBook(Member member) {
        return null;
    }

}
