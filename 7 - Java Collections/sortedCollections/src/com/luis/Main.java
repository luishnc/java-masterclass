package com.luis;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.items().keySet()) {
            System.out.println(s);
        }

        Basket luis = new Basket("Luis");

        sellItem(luis, "car", 1);
        System.out.println(luis);

        sellItem(luis, "car", 1);
        System.out.println(luis);

        if(sellItem(luis, "car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }

        sellItem(luis, "spanner", 5);
//        System.out.println(luis);

        sellItem(luis, "juice", 4);
        sellItem(luis, "cup", 12);
        sellItem(luis, "bread", 1);
//        System.out.println(luis);

//        System.out.println(stockList);

        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(luis, "car", 1);
        removeItem(luis, "cup", 9);
        removeItem(luis, "car", 1);
        System.out.println("cars removed: " + removeItem(luis, "car", 1));  // should not remove any

        System.out.println(luis);

        // remove all items from luis
        removeItem(luis, "bread", 1);
        removeItem(luis, "cup", 3);
        removeItem(luis, "juice", 4);
        removeItem(luis, "cup", 3);
        System.out.println(luis);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        StockItem car = stockList.items().get("car");
        if(car != null) {
            car.adjustStock(2000);
        }
        if(car != null) {
            stockList.get("car").adjustStock(-1000);
        }

        System.out.println(stockList);
//        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkOut(luis);
        System.out.println(luis);


    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Product does not exist");
            return 0 ;
        }

        if (stockList.reserveStock(item,quantity) != 0){
            return basket.addToBasket(stockItem,quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("Product does not exist" + item);
            return 0 ;
        }

        if (basket.removeFromBasket(stockItem,quantity) == quantity){
            return stockList.unreserveStock(item,quantity);
        }
        return 0;
    }

    public static void checkOut (Basket basket){
        for (Map.Entry<StockItem,Integer> item : basket.items().entrySet()
             ) {
            stockList.sellStock(item.getKey().getName(), item.getValue());

        }
        basket.clearBasket();
    }
}
