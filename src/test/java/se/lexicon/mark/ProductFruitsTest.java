package se.lexicon.mark;

import org.junit.Assert;
import org.junit.Test;

public class ProductFruitsTest {
    //Skapa en eats med satta värden i ProduktSweets, verifera att det är korrekt värde.
    //Skapa examine test och att metoden returnerar rätt meddelande.



    @Test
    public void test_ProductFruits(){
        //Arrange
        ProductFruits eats = new ProductFruits(7,1, "Apple", 10, "pollen", 5);

        //Act
        String expected = "Product price 1\nProduct number 7\nProduct name Apple\nProduct calories 10\nProduct allergens pollen\nProduct weight 5";

        //Assert
        Assert.assertEquals(expected,  eats.examine());
    }
}

