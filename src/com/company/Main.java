package com.company;

public class Main {

    public static void main(String[] args) {

        Store store = new Store(3);
        OrangeJuice glas1 = new OrangeJuice(8);
        OrangeJuice glas2 = new OrangeJuice(16);
        OrangeJuice glas3 = new OrangeJuice(12);
        OrangeJuice glas4 = new OrangeJuice(10);

        try {
            store.drink(glas1);
        } catch(OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch(BadTempException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
        }

        try {
            store.drink(glas2);
        } catch(OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch(BadTempException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
        }

        try {
            store.drink(glas3);
        } catch(OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch(BadTempException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
        }

        try {
            store.drink(glas4);
        } catch(OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch(BadTempException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
        }
    }
}
