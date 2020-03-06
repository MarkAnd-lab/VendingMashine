package se.lexicon.mark;

public class ProductFruits extends Product{
    //Fruits
    //Apple(1, "Apple", 10, "pollen"), Pear(5, "Pear", 20, "pollen");
    private int weight;
    public ProductFruits(int productNumber, int price, String name, int calories, String allergens, int weight) {
        super(productNumber, price, name, calories, allergens);
        this.weight = weight;
    }

    @Override
    public String examine() {
        String info = "Product price " + getPrice() + "\nProduct number " + getProductNumber() + "\nProduct name " + getName() + "\nProduct calories " + getCalories() + "\nProduct allergens " + getAllergens() + "\nProduct weight " + getWeight();
        return info;
    }

    @Override
    public String use() {
        String consume = "you eat fruit";
        //consume the product.
        // String info
        return consume;
    }

    @Override
    public int getProductNumber() {
        return super.getProductNumber();
    }

    public int getWeight() {
        return weight;
    }
}

