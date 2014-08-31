/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nmi.app;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Darren
 */
@Embeddable
public class BookDetailsPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBRARY_NAME")
    private String libraryName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AUTH_NAME")
    private String authName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "BOOK_NAME")
    private String bookName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CAT_NAME")
    private String catName;

    public BookDetailsPK() {
    }

    public BookDetailsPK(String libraryName, String authName, String bookName, String catName) {
        this.libraryName = libraryName;
        this.authName = authName;
        this.bookName = bookName;
        this.catName = catName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libraryName != null ? libraryName.hashCode() : 0);
        hash += (authName != null ? authName.hashCode() : 0);
        hash += (bookName != null ? bookName.hashCode() : 0);
        hash += (catName != null ? catName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookDetailsPK)) {
            return false;
        }
        BookDetailsPK other = (BookDetailsPK) object;
        if ((this.libraryName == null && other.libraryName != null) || (this.libraryName != null && !this.libraryName.equals(other.libraryName))) {
            return false;
        }
        if ((this.authName == null && other.authName != null) || (this.authName != null && !this.authName.equals(other.authName))) {
            return false;
        }
        if ((this.bookName == null && other.bookName != null) || (this.bookName != null && !this.bookName.equals(other.bookName))) {
            return false;
        }
        if ((this.catName == null && other.catName != null) || (this.catName != null && !this.catName.equals(other.catName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nmi.app.BookDetailsPK[ libraryName=" + libraryName + ", authName=" + authName + ", bookName=" + bookName + ", catName=" + catName + " ]";
    }
    
}
