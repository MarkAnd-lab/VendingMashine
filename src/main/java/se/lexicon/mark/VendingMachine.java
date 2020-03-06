package se.lexicon.mark;

import java.util.Arrays;

public class VendingMachine implements VendingMachineInterface{

        private static Product[] products = {
                new ProductDrinks(1,20, "Pepsi", 100, "Aspartam"),
                new ProductDrinks(2,20, "CocaCola", 100, "Aspartam"),
                new ProductSweets(3,25, "Snickers", 200, "Nuts"),
                new ProductSweets(4,25, "Twix", 200, "Wheat"),
                new ProductFood(5,50, "Chicken sandwich", 50, "Chicken"),
                new ProductFood(6,50, "Ham sandwich", 20, "Ham"),
                new ProductFruits(7,1, "Apple", 10, "pollen",5),
                new ProductFruits(8,5, "Pear", 20, "pollen",5)
        };

    public static void main(String[] args) {
        System.out.println(products[2].examine());
    }


    private double depositPool; // skapat en variabel "depositPool" där man lägger in pengarna.
    public void addCurrency (int amount){  // Add to the deposit pool (moneyPool)
        if(amount > 0){
            setDepositPool(amount);
            System.out.println("Add to the deposit pool " + amount);

            }else{
            setDepositPool(0); // om något sätt in typ -100kr så sätts det till 0.
        }


    }   @Override
        public Product request(int productNumber){ // Buy a Product
        Product product = products[productNumber -1];
        this.depositPool = this.depositPool - product.getPrice();
        System.out.println("Buy a Product" + product.getName());
        return product;
    }


    private int change;
    public int endSession (){ // Returns change and resets the deposit pool
        setChange((int) getDepositPool());
        setDepositPool(0);
        return change;

    }
        @Override
        public String getDescription (int productNumber){ // View a product description
        System.out.println("View a product description");
        return products[productNumber -1].examine();


    }


    @Override
    public double getBalance() { // Returns the deposit pool amount
        return depositPool;
    }

    @Override
    public String[] getProducts() { // Returns all Products' names and product numbers
       String[] tempProducts = new String[products.length];
       for (int i = 0; i < tempProducts.length; i ++) {
           tempProducts[i] = products[i].getProductNumber() + " " + products[i].getName();
                  }
           return tempProducts;

    }

    public double getDepositPool() {
        return depositPool;
    }

        public void setDepositPool(double depositPool) {
        this.depositPool = depositPool;
    }


    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }
    }
