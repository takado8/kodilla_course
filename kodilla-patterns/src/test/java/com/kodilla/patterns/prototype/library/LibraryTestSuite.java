package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //given
        Library library = generateTestLibrary("lib1");
        //when
        var size = library.getBooks().size();
        //then
        assertEquals(3, size);
    }

    @Test
    void testCopyLibrary() {
        //given
        var lib1 = generateTestLibrary("lib01");
        // when
        var lib2 = lib1.copy();
        // then
        assertEquals(lib1.getBooks(), lib2.getBooks());
        // when
        lib1.getBooks().clear();
        // then
        assertEquals(0, lib2.getBooks().size());
    }

    @Test
    void testDeepCopyLibrary() {
        //given
        var lib1 = generateTestLibrary("lib01");
        // when
        var lib2 = lib1.deepCopy();
        // then
        assertEquals(lib1.getBooks().size(), lib2.getBooks().size());
        // when
        lib1.getBooks().clear();
        // then
        assertEquals(3, lib2.getBooks().size());
    }

    Library generateTestLibrary(String libName) {
        Book book1 = new Book("book1", "author1", LocalDate.of(2001, 1, 1));
        Book book2 = new Book("book2", "author2", LocalDate.of(2002, 2, 2));
        Book book3 = new Book("book3", "author3", LocalDate.of(2003, 3, 3));
        Library library = new Library(libName);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        return library;
    }
}
