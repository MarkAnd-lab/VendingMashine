package se.lexicon.mark;

public class ProductSweets extends Product {
    //Sweets
    //Snickers(25, "Snickers",200,"Nuts"), Twix(25,"Twix", 200, "Wheat");


    public ProductSweets(int productNumber, int price, String name, int calories, String allergens) {
        super(productNumber, price, name, calories, allergens);
    }

    @Override
    public String examine() {
        String info = "Product price " + getPrice() + "\nProduct number " + getProductNumber() + "\nProduct name " + getName() + "\nProduct calories " + getCalories() + "\nProduct allergens " + getAllergens();
        return info;
    }

    @Override
    public String use() {
            String consume = "you eat Sweets";
            //consume the product.
            // String info
            return consume;
    }

    @Override
    public int getProductNumber() {
        return super.getProductNumber();
    }
}


