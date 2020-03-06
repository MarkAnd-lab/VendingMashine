package se.lexicon.mark;

import org.junit.Assert;
import org.junit.Test;



public class ProductDrinkTest {
    //Skapa en dryck med satta värden i ProduktDrinks, verifera att det är korrekt värde.
    //Skapa examine test och att metoden returnerar rätt medelande.



    @Test
    public void test_ProductDrinks(){
        //Arrange
        ProductDrinks drinks = new ProductDrinks(1,20, "Pepsi", 100, "Aspartam");

        //Act
        String expected = "Product price 20\nProduct number 1\nProduct name Pepsi\nProduct calories 100\nProduct allergens Aspartam";

        //Assert
        Assert.assertEquals(expected,  drinks.examine());
    }
}
