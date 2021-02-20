package shop;

import behaviour.ISell;
import people.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Shop {
    private String shopName;
    private ArrayList<ISell> stockList;
    private HashMap<ISell, Double> profitList;
    private double totalPotentialProfit;
    private ArrayList<Customer> registeredCustomers;
    private double till;


    public Shop(String shopName, ArrayList<ISell> stockList, double till) {
        this.shopName = shopName;
        this.stockList = stockList;
        this.profitList = new HashMap<ISell, Double>();
        this.totalPotentialProfit = 0;
        this.registeredCustomers = new ArrayList<Customer>();
        this.till = till;

    }


    public void addStock(ISell itemToAdd){
        this.stockList.add(itemToAdd);
        this.profitList.put(itemToAdd, itemToAdd.calcMarkUp());
        this.till -= itemToAdd.getBoughtFor();

    }

    public void removeFromStock(ISell itemToRemove){
        this.stockList.remove(itemToRemove);
        this.profitList.remove(itemToRemove);
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public ArrayList<ISell> getStockList() {
        return stockList;
    }
    public int getStockListLength() {
        return stockList.size();
    }

    public void setStockList(ArrayList<ISell> stockList) {
        this.stockList = stockList;
    }

    public int getProfitListLength(){
        return this.profitList.size();
    }

    public HashMap<ISell, Double> getProfitList() {

        return this.profitList;
    }

    public double getTotalPotentialProfit() {
        double sum = 0;
        for(double value: this.profitList.values()){
            sum += value;
        }
        this.totalPotentialProfit = sum;
        return this.totalPotentialProfit;
    }

    public String generateAccNo(){
        Random rnd = new Random();
        int number = rnd.nextInt(999);
        return String.format("%06d", number);
    }

    public void registerCustomer(Customer customer){
        this.registeredCustomers.add(customer);

        customer.setAccNo(this.generateAccNo());
    }

    public double getTill() {
        return this.till;
    }

    public int getNumRegisteredCustomers() {
        return this.registeredCustomers.size();
    }

    public ArrayList<Customer> getRegisteredCustomers() {
        return registeredCustomers;
    }
}
