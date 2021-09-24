package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        // Given
        TaxiOrder order = new BasicTaxiOrder();
        // When
        BigDecimal calculatedCost = order.getCost();
        // Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        // Given
        TaxiOrder order = new BasicTaxiOrder();
        // When
        String description = order.getDescription();
        // Then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        //When
        BigDecimal theCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new MyTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        //When
        BigDecimal theCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(37), theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new MyTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testUberWithTwoChildSeatsGetCost() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new UberNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new ChildSeatDecorator(order);
        //When
        BigDecimal theCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(29), theCost);
    }

    @Test
    public void testUberWithTwoChildSeatsGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new MyTaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new ChildSeatDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat + child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new ExpressDecorator(order);
        order = new VipCarDecorator(order);
        order = new ChildSeatDecorator(order);
        System.out.println(order.getCost());
        //When
        BigDecimal theCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(57), theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new ExpressDecorator(order);
        order = new VipCarDecorator(order);
        order = new ChildSeatDecorator(order);
        System.out.println(order.getDescription());
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network express service variant VIP + child seat", description);
    }
}
