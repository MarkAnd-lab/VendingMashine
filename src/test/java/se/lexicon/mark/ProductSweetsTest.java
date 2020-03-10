package se.lexicon.mark;

import org.junit.Assert;
import org.junit.Test;

public class ProductSweetsTest {
    //Skapa en eats med satta värden i ProduktSweets, verifera att det är korrekt värde.
    //Skapa examine test och att metoden returnerar rätt meddelande.



    @Test
    public void test_ProductSweets(){
        //Arrange
        ProductSweets eats = new ProductSweets(3,25, "Snickers", 200, "Nuts");

        //Act
        String expected = "Product price 25\nProduct number 3\nProduct name Snickers\nProduct calories 200\nProduct allergens Nuts";

        //Assert
        Assert.assertEquals(expected,  eats.examine());
    }
}

