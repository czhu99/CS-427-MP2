package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

import java.util.ArrayList;
import java.util.List;

public class ObservableStockImpl extends ObservableStock {

    //@TODO: Add any necessary fields
    ArrayList<ObserverStockExchangeCenter> exchanges;

    public ObservableStockImpl(StockType name){
        super(name);
        //@TODO: Implememnt me
        exchanges = new ArrayList<ObserverStockExchangeCenter>();
    }

    public void notifyPriceChange(double price){
        //@TODO: Implememnt me
        for (ObserverStockExchangeCenter o : exchanges) {
            o.notifyChange(this.getName(), price);
        }
    }
    public void registerStockExchangeCenter(ObserverStockExchangeCenter oc){
        //@TODO: Implememnt me
        exchanges.add(oc);
    }

    //@TODO: Override any necessary methods
    public void setPrice(double price) {
        super.setPrice(price);
        notifyPriceChange(price);
    }
}
