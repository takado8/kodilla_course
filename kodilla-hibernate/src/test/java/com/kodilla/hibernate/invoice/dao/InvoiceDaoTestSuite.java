package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    private final String NUMBER = "23364734";

    @Test
    void testInvoiceDaoSave(){
        // given
        Product product1 = new Product("prod1");
        Product product2 = new Product("prod2");
        Item item1 = new Item(10,product1, new BigDecimal("12.45"), new BigDecimal("15.5"));
        Item item2 = new Item(12,product2, new BigDecimal("1.23"), new BigDecimal("14.8"));
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        Invoice invoice = new Invoice(NUMBER, items);
        //when
        invoiceDao.save(invoice);
        //Then
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        assertTrue(readInvoice.isPresent());
        //CleanUp
        invoiceDao.deleteById(id);
    }
}
