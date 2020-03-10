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

    @Test
    public void ProductInformationTest() {
        //Act
        String result = vendingMachine.getDescription(2);

        //Assert
        Assert.assertTrue(result.contains("2"));
        Assert.assertTrue(result.contains("CocaCola"));
        Assert.assertTrue(result.contains("20"));
        Assert.assertTrue(result.contains("100"));
        Assert.assertTrue(result.contains("Aspartam"));
    }

    @Test
    public void GetBalanceTest() {

        //Arrange
        int expectedResult = 100;
        vendingMachine.setDepositPool(100);

        //Assert
        Assert.assertEquals(expectedResult, vendingMachine.getBalance(), 0);
    }
    @Test
    public void EndSessionTest() {

        //Arrange
        vendingMachine.setDepositPool(100);
        int expectedResult = 100;

        //Act
        vendingMachine.endSession();

        //Assert
        Assert.assertEquals(vendingMachine.getChange(),expectedResult,0);
        Assert.assertNotEquals(vendingMachine.getDepositPool(),expectedResult,0);
    }
    @Test
    public void ProductRequestTest() {
        //Arrange
        vendingMachine.setDepositPool(100);
        int expectedResult = 80;

        //Act
        vendingMachine.request(2);

        //Assert
        Assert.assertEquals(expectedResult,vendingMachine.getDepositPool());
    }
}