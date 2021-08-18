package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        // Given
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("auth1", "title1", 1000, "aaaa1");
        Book book2 = new Book("auth2", "title2", 1500, "aaaa2");
        Book book3 = new Book("auth3", "title3", 2000, "aaaa3");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter(new Statistics());
        // When
        int publicationMedian = medianAdapter.publicationYearMedian(bookSet);
        // then
        assertEquals(1500, publicationMedian);
    }
}
