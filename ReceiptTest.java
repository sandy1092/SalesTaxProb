package com.sandhya.salesTaxCalculator;

import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ReceiptTest {

    @InjectMocks
    private Receipt reciept;


//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//    }
//
    @Test
    public void testCorrectCalculateTotals() throws Exception{
        Receipt r1 = new Receipt("test1.txt");
        double expected = 29.83;
        double actual = r1.calculateTotals();
        assertEquals(expected, actual);
    }

    @Test
    public void testInCorrectCalculateTotals() throws Exception{
        Receipt r1 = new Receipt("test1.txt");
        double expected = 27.83;
        double actual = r1.calculateTotals();
        assertNotEquals(expected, actual);
    }

   /* Not Required */
    private List<Product> getProductsList(){

        List<Product> productsList = new ArrayList<>();
        productsList.add(getProductDetails());

        return productsList;
    }

    private Product getProductDetails() {

        Product firstProd = new Product("book", 12.49f, ItemType.BOOK);
        return firstProd;
    }

}