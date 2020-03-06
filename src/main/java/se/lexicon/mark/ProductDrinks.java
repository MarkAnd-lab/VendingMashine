package se.lexicon.mark;

public class ProductDrinks extends Product {

    //Drinks
    //Pepsi(20, "Pepsi", 100, "Aspartam"), CocaCola(20,"CocaCola",100,"Aspartam");


    public ProductDrinks(int productNumber, int price, String name, int calories, String allergens) {
        super(productNumber, price, name, calories, allergens);
    }

    @Override
    public String examine() {
        String info = "Product price " + getPrice() + "\nProduct number " + getProductNumber() + "\nProduct name " + getName() + "\nProduct calories " + getCalories() + "\nProduct allergens " + getAllergens();
        return info;
    }

    @Override
    public String use() {
        //consume the product.
       // String info
        return "";
    }

    @Override
    public int getProductNumber() {
        return super.getProductNumber();
    }
}
