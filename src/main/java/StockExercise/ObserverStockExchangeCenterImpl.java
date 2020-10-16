package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

public class ObserverStockExchangeCenterImpl extends ObserverStockExchangeCenter {
    public ObserverStockExchangeCenterImpl() {
        super();
    }

    public void notifyChange(StockType type, double price){
        //@TODO: Implememnt me
        this.ownedStock.put(type, price);
    }

    //@TODO: Override any necessary methods
    public void buyStock(ObservableStock s) {
        super.buyStock(s);
        observe(s);
    }

    public void observe(ObservableStock o){
        //@TODO: Implememnt me
        o.registerStockExchangeCenter(this);
    }
}
