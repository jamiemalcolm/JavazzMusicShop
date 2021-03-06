package people;

import behaviour.ISell;
import items.DrumKit;
import shop.Shop;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String accNo;
    private ArrayList<ISell> basket;
    private ArrayList<ISell> collection;
    private double wallet;

    public Customer(String name, double wallet) {
        this.name = name;
        this.accNo = "";
        this.basket = new ArrayList<ISell>();
        this.collection = new ArrayList<ISell>();
        this.wallet = wallet;
    }


    public String getName() {
        return name;
    }

    public String getAccNo() {
        return accNo;
    }

    public ArrayList<ISell> getBasket() {
        return basket;
    }

    public ArrayList<ISell> getCollection() {
        return collection;
    }

    public double getWallet() {
        return wallet;
    }

    public void setAccNo(String number){
        this.accNo = number;
    }

    public void signUp(Shop shop) {
        shop.registerCustomer(this);
    }

    public void buy(ISell item) {
        this.wallet -= item.getSellFor();
        this.collection.add(item);
    }

    public void addToBasket(ISell item) {
        this.basket.add(item);
    }

    public double getBasketTotal(){
        double total = 0;
        for(ISell item : this.basket){
            total += item.getSellFor();
        }
        return total;
    }

    public String goToCheckout() {
        double total = getBasketTotal();
        String totalString = String.valueOf(total);
        return "Your basket total is: £" + totalString;
    }

    public void payForBasket() {
        for(ISell item : basket){
            buy(item);
        }
    }
}
