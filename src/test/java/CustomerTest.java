import behaviour.ISell;
import items.*;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import shop.Shop;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CustomerTest {
    Shop shop;
    DrumKit drumKit1;
    DrumKit drumKit2;
    DrumSticks drumSticks1;
    DrumSticks drumSticks2;
    DrumSticks drumSticks3;
    DrumSticks drumSticks4;
    SheetMusic sheetMusic1;
    SheetMusic sheetMusic2;
    Guitar guitar1;
    Guitar guitar2;
    Guitar guitar3;
    Piano piano1;
    Piano piano2;
    Piano piano3;
    Trumpet trumpet1;
    Trumpet trumpet2;
    Customer customer;

    @Before
    public void before(){
        drumKit1 = new DrumKit("boom boom ba boom claaang", 200.00, true, 4, 3);
        drumKit2 = new DrumKit("boom boom ba boom claaang", 300.00, true, 6, 3);
        drumSticks1 = new DrumSticks(7.50, InstrumentType.PERCUSSION, "A6");
        drumSticks2 = new DrumSticks(7.50, InstrumentType.PERCUSSION, "B7");
        drumSticks3 = new DrumSticks(8.50, InstrumentType.PERCUSSION, "C2");
        drumSticks4 = new DrumSticks(9.50, InstrumentType.PERCUSSION, "D9");
        sheetMusic1 = new SheetMusic(2.50, InstrumentType.BRASS, "Yankee Doodle");
        sheetMusic2 = new SheetMusic(2.50, InstrumentType.KEYS, "Beathoven's 4th");
        guitar1 =  new Guitar("Strum de dum",125.00, true, 6 );
        guitar2 = new Guitar("waaa whaaaa waaa",225.00, false, 6);
        guitar3 = new Guitar("dum dum doom dum doom", 175.00, false, 4);
        piano1 = new Piano("tinkle tiii tinkle toooe", 600, true, "Upright");
        piano2 = new Piano("tinkle tiii tinkle toooe de taaa", 400, false, "Electric Upright");
        piano3 = new Piano("tinkle tiii tinkle toooe", 900, true, "Grand");
        trumpet1 = new Trumpet("troooot too toottt tooot", 100, true, 4);
        trumpet2 = new Trumpet("troooot too toottt tooot", 100, true, 3);
        ArrayList<ISell> startingStock = new ArrayList<ISell>();

        shop = new Shop("Jamie's Musical Marvels", startingStock, 10000.00);
        shop.addStock(drumKit1);
        shop.addStock(drumSticks1);
        shop.addStock(drumSticks2);
        shop.addStock(drumSticks3);
        shop.addStock(sheetMusic1);
        shop.addStock(sheetMusic2);
        shop.addStock(guitar1);
        shop.addStock(guitar2);
        shop.addStock(piano1);
        shop.addStock(trumpet1);
        customer = new Customer("Laura", 800.00);
    }

    @Test
    public void customerDoesNotHaveAccNo(){
        assertEquals("", customer.getAccNo());
    }

    @Test
    public void customerHasAccNoAfterRegister(){
        customer.signUp(shop);
        assertNotEquals("", customer.getAccNo());
    }

    @Test
    public void customerCanAddItemToBasket(){
        customer.addToBasket(drumKit1);
        ArrayList<ISell> basket = new ArrayList<ISell>();
        basket.add(drumKit1);
        assertEquals(basket, customer.getBasket());
    }

    @Test
    public void customerCanGoToCheckout(){
        customer.addToBasket(drumKit1);
        customer.addToBasket(sheetMusic1);
        assertEquals("Your basket total is: £303.75", customer.goToCheckout());
    }

    @Test
    public void customerCanBuyItem(){
        customer.buy(drumKit1);
        assertEquals(500, customer.getWallet(), 0.01);
    }
    @Test
    public void customerCanPayForAllItemsInBasket(){
        customer.addToBasket(drumKit1);
        customer.addToBasket(sheetMusic1);
        customer.payForBasket();
        ArrayList<ISell> testCollection = new ArrayList<ISell>();
        testCollection.add(drumKit1);
        testCollection.add(sheetMusic1);
        assertEquals(496.25, customer.getWallet(), 0.01);
        assertEquals(testCollection, customer.getCollection());
    }
}
