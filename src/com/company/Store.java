package com.company;

public class Store {

    private int stock;

    public Store(int stock) {
        this.stock = stock;
    }

    public void drink(OrangeJuice glas) throws BadTempException, OutOfStockException {
        if(this.stock <= 0) {
            throw new OutOfStockException("No more orange juice in stock!");
        } else if(glas.getCurrTemp() < (glas.getOptTemp() - 3)) {
            this.stock--;
            System.out.println(this.stock + " orange juice left in stock.");
            throw new BadTempException("The juice is too cold!");
        } else if(glas.getCurrTemp() > (glas.getOptTemp() + 3)) {
            this.stock--;
            System.out.println(this.stock + " orange juice left in stock.");
            throw new BadTempException("The juice is too warm!");
        } else {
            this.stock--;
            System.out.println(this.stock + " orange juice left in stock.");
            System.out.println("The juice has the perfect temperature! Yummy!!!");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
