package se.lexicon.mark;

/* A class that implements the VendingMachine interface
*   - Contains array with Products and deposit pool
/**
 * Vending Machine!
 *
 **/
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Marks Candy Vending Machine!" );

        VendingMachine vendingMachine = new VendingMachine();
        System.out.println(vendingMachine.getDescription(3));
    }

}
