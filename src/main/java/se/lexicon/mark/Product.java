package se.lexicon.mark;

public abstract class Product {


    //Drinks, Sweets, Food, Fruits
    private final int productNumber;
    private double price;
    private String name;
    private int calories;
    private String allergens;


    public Product(int productNumber, int price, String name, int calories, String allergens) {
        this.productNumber = productNumber;
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.allergens = allergens;
    }
    public abstract String examine();
    public abstract String use();
    public int getProductNumber(){
        return this.productNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getAllergens() {
        return allergens;
    }
}
