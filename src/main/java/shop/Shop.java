package shop;

import behaviour.ISell;
import items.InstrumentType;
import people.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.Collectors;

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

    public ArrayList<ISell> searchItemsByInstrumentType(InstrumentType instrumentType) {
        ArrayList<ISell> foundItems = new ArrayList<ISell>();
        for(ISell item : this.stockList){
            if(item.getInstrumentType() == instrumentType){
                foundItems.add(item);
            }
        }
        return foundItems;
    }

    public ArrayList<ISell> showItemsForPriceOrLess(double price) {
        ArrayList<ISell> foundItems = new ArrayList<ISell>();
        for(ISell item : this.stockList){
            if(item.getSellFor() <= price){
                foundItems.add(item);
            }
        }
        return foundItems;
    }

    public ArrayList<ISell> sortItemsAscendingPrice() {
        ArrayList<ISell> sortedAscending = this.stockList.stream()
                .sorted(Comparator.comparingDouble(ISell::getSellFor))
                .collect(Collectors.toList());
        return sortedAscending;
    }
}
