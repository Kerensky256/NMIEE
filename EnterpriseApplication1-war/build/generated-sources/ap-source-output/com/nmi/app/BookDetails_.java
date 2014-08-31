package com.nmi.app;

import com.nmi.app.Authors;
import com.nmi.app.BookDetailsPK;
import com.nmi.app.Books;
import com.nmi.app.Category;
import com.nmi.app.Library;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-08-30T19:01:42")
@StaticMetamodel(BookDetails.class)
public class BookDetails_ { 

    public static volatile SingularAttribute<BookDetails, Books> books;
    public static volatile SingularAttribute<BookDetails, Authors> authors;
    public static volatile SingularAttribute<BookDetails, Category> category;
    public static volatile SingularAttribute<BookDetails, Library> library;
    public static volatile SingularAttribute<BookDetails, BookDetailsPK> bookDetailsPK;

}