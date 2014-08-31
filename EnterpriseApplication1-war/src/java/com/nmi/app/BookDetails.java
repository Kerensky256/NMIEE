/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nmi.app;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Darren
 */
@Entity
@Table(name = "BOOK_DETAILS", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookDetails.findAll", query = "SELECT b FROM BookDetails b")})
public class BookDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BookDetailsPK bookDetailsPK;
    @JoinColumn(name = "LIBRARY_NAME", referencedColumnName = "LIBRARY_NAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Library library;
    @JoinColumn(name = "CAT_NAME", referencedColumnName = "CAT_NAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Category category;
    @JoinColumn(name = "BOOK_NAME", referencedColumnName = "BOOK_NAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Books books;
    @JoinColumn(name = "AUTH_NAME", referencedColumnName = "AUTH_NAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Authors authors;

    public BookDetails() {
    }

    public BookDetails(BookDetailsPK bookDetailsPK) {
        this.bookDetailsPK = bookDetailsPK;
    }

    public BookDetails(String libraryName, String authName, String bookName, String catName) {
        this.bookDetailsPK = new BookDetailsPK(libraryName, authName, bookName, catName);
    }

    public BookDetailsPK getBookDetailsPK() {
        return bookDetailsPK;
    }

    public void setBookDetailsPK(BookDetailsPK bookDetailsPK) {
        this.bookDetailsPK = bookDetailsPK;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookDetailsPK != null ? bookDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookDetails)) {
            return false;
        }
        BookDetails other = (BookDetails) object;
        if ((this.bookDetailsPK == null && other.bookDetailsPK != null) || (this.bookDetailsPK != null && !this.bookDetailsPK.equals(other.bookDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nmi.app.BookDetails[ bookDetailsPK=" + bookDetailsPK + " ]";
    }
    
}
