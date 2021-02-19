package shop;

import behaviour.ISell;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private String shopName;
    private ArrayList<ISell> stockList;
    private HashMap<ISell, Double> profitList;
    private double totalPotentialProfit;


    public Shop(String shopName, ArrayList<ISell> stockList) {
        this.shopName = shopName;
        this.stockList = stockList;
        this.profitList = new HashMap<ISell, Double>();
        this.totalPotentialProfit = 0;

    }


    public void addStock(ISell itemToAdd){
        this.stockList.add(itemToAdd);
        this.profitList.put(itemToAdd, itemToAdd.calcMarkUp());

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
}
