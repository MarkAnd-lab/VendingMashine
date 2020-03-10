package se.lexicon.mark;

import org.junit.Assert;
import org.junit.Test;

public class ProduktFoodTest {
    //Skapa en eats med satta värden i ProduktSweets, verifera att det är korrekt värde.
    //Skapa examine test och att metoden returnerar rätt meddelande.



    @Test
    public void test_ProductFood(){
        //Arrange
        ProductSweets eats = new ProductSweets(5,50, "Chicken sandwich", 50, "Chicken");

        //Act
        String expected = "Product price 50\nProduct number 5\nProduct name Chicken sandwich\nProduct calories 50\nProduct allergens Chicken";

        //Assert
        Assert.assertEquals(expected,  eats.examine());
    }
}

