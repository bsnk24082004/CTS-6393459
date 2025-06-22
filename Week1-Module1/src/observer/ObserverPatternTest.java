package observer;

//ObserverPatternTest.java
public class ObserverPatternTest {
 public static void main(String[] args) {
     // Create a stock market and some observers (apps)
     StockMarket stockMarket = new StockMarket("Tesla");
     MobileApp mobileApp = new MobileApp("StockWatcher Mobile");
     WebApp webApp = new WebApp("StockWatcher Web");

     // Register observers
     stockMarket.registerObserver(mobileApp);
     stockMarket.registerObserver(webApp);

     // Set stock price and notify observers
     stockMarket.setStockPrice(650.25);
     stockMarket.setStockPrice(675.50);

     // Deregister one observer (WebApp)
     stockMarket.deregisterObserver(webApp);

     // Set new stock price and notify remaining observers
     stockMarket.setStockPrice(700.75);
 }
}