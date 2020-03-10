package se.lexicon.mark;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

    VendingMachine vendingMachine;

    @Before
    public void before() {
        vendingMachine = new VendingMachine();
    }


    @Test
    public void addCurrencyTest() {

        //Arrange

        vendingMachine.addCurrency(120);
        vendingMachine.addCurrency(20);

        //Act
        int expected = 140;

        //Assert
        Assert.assertEquals(140, vendingMachine.getBalance());
    }

    @Test
    public void requestTest() {

        //Arrange
        vendingMachine.addCurrency(20);

        //Act
        int expected = 0;
        Product actual = vendingMachine.request(1);

        //Assert
        Assert.assertEquals("Pepsi", actual.getName());
        Assert.assertEquals(expected, vendingMachine.getBalance());
    }
}