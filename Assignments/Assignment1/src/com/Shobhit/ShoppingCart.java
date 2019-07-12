package com.Shobhit;

import java.util.*;

public class ShoppingCart {
    private ArrayList<Item> shopList= new ArrayList<Item>();

    private ArrayList<Item> stockList= new ArrayList<Item>();

    public void createList(){
        Item Item1= new Item("bread",24, 25);
        stockList.add(Item1);

        Item Item2= new Item("egg",50, 7);
        stockList.add(Item2);

        Item Item3= new Item("butter",12, 30);
        stockList.add(Item3);

        Item Item4= new Item("chips",40, 10);
        stockList.add(Item4);


    }

    public void addShopItem(String item, int qty){
        int position= findItem(stockList, item);
        if(position<0)
            System.out.println("Input Item is not in inventory");
        else{
            int oldPosition= findItem(shopList,item);
            if(oldPosition<0) {
                shopList.add(stockList.get(position));
                shopList.get(shopList.size() - 1).quantity = qty;
            }else {
                shopList.get(oldPosition).quantity= qty;
                System.out.println("Quantity of " + shopList.get(oldPosition).name + " is now " + qty);
            }
        }

    }

    public void modifyShopItem(String currentItem, String newItem){

        int position = findItem(shopList,currentItem);
        if(position >= 0) {
            int newIndex= findItem(stockList, newItem);
            modifyShopItem(position, newIndex);
        }
    }

    public void modifyShopItem(int position, int  newIndex){
        shopList.set(position, stockList.get(newIndex));

    }

    //Universal findItem
    private int findItem(ArrayList<Item> shop,String searchItem){
        int index=-1;
        for(int i=0; i<shop.size(); i++){
            if(shop.get(i).name.equals(searchItem))
                 index=i;
        }

        return index;
    }

    public void removeShopItem(String item){
        int position= findItem(shopList,item);
        if(position>=0)
            removeShopItem(position);
        else
        System.out.println("Item not found");
    }

    private void removeShopItem(int position){
    	String removedItem= shopList.get(position).name;
        shopList.remove(position);
        System.out.println("Item: "+  removedItem +" removed");
    }

    public void printShopList() {
        System.out.println("You have " + shopList.size() + " items in your shopping list");
        System.out.format("%5s%10s%5s","Item","Price","Qty");
        System.out.println();
        for(int i=0; i< shopList.size(); i++) {
            System.out.format("%-1d %-1s %-7.2f %-5d",(i+1), shopList.get(i).name , shopList.get(i).price, shopList.get(i).quantity);
            System.out.println();
        }
    }

    public void printStockList(){
        System.out.format("%5s%10s%5s","Item","Price","Qty");
        System.out.println();
        for(int i=0; i< stockList.size(); i++) {
            System.out.format("%-1d %-1s %-7.2f %-5d",(i+1), stockList.get(i).name, stockList.get(i).price, stockList.get(i).quantity);
            System.out.println();
        }
    }

    public void generateBill(){
        double totalPrice=0;
        printShopList();
        for(int i=0; i<shopList.size(); i++){
            totalPrice+= (shopList.get(i).price)*(shopList.get(i).quantity);
        }

        System.out.println("Total Amount:      " + totalPrice);
    }
}
