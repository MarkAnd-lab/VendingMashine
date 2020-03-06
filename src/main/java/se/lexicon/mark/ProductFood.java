package se.lexicon.mark;

public class ProductFood extends Product {
    //Food
    //ChickenSandwich(50, "Chicken sandwich", 50, "Chicken"), HamSandwich(50, "Ham sandwich", 20, "Ham");

    public ProductFood(int productNumber, int price, String name, int calories, String allergens) {
        super(productNumber, price, name, calories, allergens);
    }

    @Override
    public String examine() {
        String info = "Product price " + getPrice() + "\nProduct number " + getProductNumber() + "\nProduct name " + getName() + "\nProduct calories " + getCalories() + "\nProduct allergens " + getAllergens();
        return info;
    }

    @Override
    public String use() {
        return "";
    }

    @Override
    public int getProductNumber() {
        return super.getProductNumber();
    }
}

