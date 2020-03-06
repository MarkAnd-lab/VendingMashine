package se.lexicon.mark;

import org.junit.Assert;
import org.junit.Test;



public class ProductDrinkTest {
    //Skapa en dryck med satta värden i ProduktDrinks, verifera att det är korrekt värde.
    //Skapa examine test och att metoden returnerar rätt medelande.

    public class Drink_Test {

        private Pepsi drinkTest;
        private final int productNumber = 1;
        private int price = 20;
        private String name = "Pepsi";
        private int calories = 100;
        private String allergens = "Aspartam";
        private int expected =
    }


    @Test
    public void test_ProductDrinks(){

        //Arrange
        Pepsi drinkTest;
        final int productNumber = 1;
        int price = 20;
        String name = "Pepsi";
        int calories = 100;
        String allergens = "Aspartam";
        int expected

        //Act
        testProductDrinks = new ProductDrinks(productNumber, price, name, calories, allergens);

        //Assert
        Assert.assertEquals(expected name);
    }
}
