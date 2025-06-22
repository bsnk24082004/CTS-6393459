package observer;

//StockMarket.java
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
 private List<Observer> observers;
 private String stockName;
 private double stockPrice;

 public StockMarket(String stockName) {
     this.stockName = stockName;
     this.observers = new ArrayList<>();
 }

 // Register an observer
 @Override
 public void registerObserver(Observer observer) {
     observers.add(observer);
 }

 // Deregister an observer
 @Override
 public void deregisterObserver(Observer observer) {
     observers.remove(observer);
 }

 // Notify all observers about stock price change
 @Override
 public void notifyObservers() {
     for (Observer observer : observers) {
         observer.update(stockName, stockPrice);
     }
 }

 // Update stock price and notify observers
 public void setStockPrice(double stockPrice) {
     this.stockPrice = stockPrice;
     notifyObservers();
 }
}