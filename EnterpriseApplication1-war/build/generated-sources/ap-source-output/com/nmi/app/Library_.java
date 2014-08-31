package com.nmi.app;

import com.nmi.app.BookDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-08-30T19:01:42")
@StaticMetamodel(Library.class)
public class Library_ { 

    public static volatile CollectionAttribute<Library, BookDetails> bookDetailsCollection;
    public static volatile SingularAttribute<Library, String> libraryName;

}