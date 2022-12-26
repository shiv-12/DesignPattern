/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraymanagementdesign;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class BookCopy {

    private int bookCopyId;
    private String bookName;
    private List<String> authorNames;
    private Date publishDate;

    public BookCopy(int bookCopyId, String bookName, List<String> authorNames, Date publishDate) {
        this.bookCopyId = bookCopyId;
        this.bookName = bookName;
        this.authorNames = authorNames;
        this.publishDate = publishDate;
    }

    public int getBookCopyId() {
        return bookCopyId;
    }

    public String getBookName() {
        return bookName;
    }

    public List<String> getAuthorNames() {
        return authorNames;
    }

    public Date getPublishDate() {
        return publishDate;
    }

}
