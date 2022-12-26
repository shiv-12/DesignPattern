/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraymanagementdesign;

import user.Member;
import auth.IdGenerator;
import auth.UserAuthenticator;
import java.util.Date;
import java.util.List;
import lib.Library;
import searcher.AuthorBasedBookSearcher;
import searcher.BookSearcher;
import searcher.IdBasedBookSearcher;
import searcher.IdBasedMemberSearcher;
import searcher.MemberSearcher;
import searcher.NameBasedBookSearcher;
import searcher.NameBasedMemberSearcher;

public class Tester {

    private final Library library = new Library();

    // this is the Api Layer
    public List<BookCopy> searchBookByBookName(String bookName) {

        if (bookName == null) {
            throw new IllegalArgumentException("bookName can not be null");
        } else {
            BookSearcher bookSearcher = new NameBasedBookSearcher(bookName);
            return bookSearcher.search();
        }

    }

    public List<BookCopy> searchBookByAuthoNames(List<String> authorName) {
        if (authorName == null || authorName.size() == 0) {
            throw new IllegalArgumentException("authorName can not be null");
        } else {
            BookSearcher bookSearcher = new AuthorBasedBookSearcher(authorName);
            return bookSearcher.search();
        }

    }

    public List<Member> searchMembersByMemberName(String memberName, String token) throws IllegalAccessException {

        // first do some authentication then do something else 
        if (!UserAuthenticator.isAdmin(token)) {
            throw new IllegalAccessException("token is not vailed");
        }

        if (memberName == null) {
            throw new IllegalArgumentException("memberName can not be null");
        } else {
            MemberSearcher memberSearcher = new NameBasedMemberSearcher(memberName);
            return memberSearcher.search();
        }

    }

    // admin Api's.... authenticate krne ke liye hum tokens ka use krege 
    public void addBook(String bookName, List<String> authors, Date publishDate, String token) throws IllegalAccessException {

        if (!UserAuthenticator.isAdmin(token)) {
            throw new IllegalAccessException("Operation forbidden");
        }
        //  also need to check vailidations for all the arguments like isEmpty isNull and all 
        //  if everything is fine then 
        int myUniqueId = IdGenerator.uniqueIdGenerator();
        BookCopy bookCopy = new BookCopy(myUniqueId, bookName, authors, publishDate);
        //  AddIteamsIntoLibrary addIteamsIntoLibrary = new AddBook(bookCopy);
        //  addIteamsIntoLibrary.addItems();
        library.addBookCopy(bookCopy);

    }

    public void deleteBook(int bookCopyId, String token) throws IllegalAccessException {

        if (bookCopyId <= 0 || token == null || token.length() == 0) {
            throw new IllegalArgumentException("Invailed bookCopyId or token");
        }
        if (!UserAuthenticator.isAdmin(token)) {
            throw new IllegalAccessException("Operation forbidden");
        }
        // also need to check vailidations for all the arguments like isEmpty isNull and all 

        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId);
        List<BookCopy> bookcopies = bookSearcher.search();
        if (bookcopies == null || bookcopies.size() == 0) {
            throw new RuntimeException("No bookCopies retrive for given ids");
        }
        BookCopy bookcopy = bookcopies.get(0);
        library.deleteBookCopy(bookcopy);

    }

    public void blockMember(int memberId, String token) throws IllegalAccessException {
        if (memberId <= 0 || token == null || token.length() == 0) {
            throw new IllegalArgumentException("Invailed memberId or token");
        }
        if (!UserAuthenticator.isAdmin(token)) {
            throw new IllegalAccessException("Operation forbidden");
        }

        List<Member> members = new IdBasedMemberSearcher(memberId).search();
        if (members.size() == 0 || members == null) {
            throw new RuntimeException("memberid is invailied");
        }

        library.blockMember(members.get(0));

    }

    public void issuedBook(int memberId, int bookCopyId, String token) {
        // validate all the arguments first
        Member member = new IdBasedMemberSearcher(memberId).search().get(0);
        BookCopy bookCopy = new IdBasedBookSearcher(bookCopyId).search().get(0);
        library.issueBook(bookCopy, member);
    }

    public void submitBook(int memberId, int bookCopyId, String token) {
        // validate all the arguments first
        Member member = new IdBasedMemberSearcher(memberId).search().get(0);
        BookCopy bookCopy = new IdBasedBookSearcher(bookCopyId).search().get(0);
        library.submitBook(bookCopy, member);

    }

    public Member getBorrowerOfBook(int bookCopyId, String token) {
        // validate all the arguments first
        BookCopy bookCopy = new IdBasedBookSearcher(bookCopyId).search().get(0);
        return library.getBorrower(bookCopy);
    }

    public List<BookCopy> getBooksBorrowedByMember(int memberId, String token) {
        // validate all the arguments first
        Member member = new IdBasedMemberSearcher(memberId).search().get(0);
        // member is the business object
        return library.getBorrowedBook(member);
    }

}
