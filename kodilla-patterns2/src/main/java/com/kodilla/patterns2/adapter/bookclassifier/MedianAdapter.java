package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    public MedianAdapter(Statistics statistics) {
        super(statistics);
    }

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book>
                bookMap = new HashMap<>();
        for (var book : bookSet){
            bookMap.put(new BookSignature(book.getSignature()),
                    new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book
                            (book.getAuthor(),book.getTitle(), book.getPublicationYear()));
        }
        return this.medianPublicationYear(bookMap);
    }
}
