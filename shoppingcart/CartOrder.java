package shoppingcart;

import java.util.*;

public class CartOrder {

    private Map<Integer, Integer> shoppingCart;
    public static Map<Integer, ItemModel> items;
    private double totalAmount;

    public CartOrder() {
        shoppingCart = new HashMap<>();
        totalAmount = 0.0;
    }

    public void addItemInCart(int itemId, int quantity) {
        if (items.containsKey(itemId))
            shoppingCart.put(itemId, quantity);
        else
            System.out.println("Product is not available.");
        totalAmount += items.get(itemId).getItemPrice() * quantity;
    }

    public void removeItemFromCart(int itemId) {
        if (shoppingCart.containsKey(itemId)) {
            totalAmount -= items.get(itemId).getItemPrice() * shoppingCart.get(itemId);
            shoppingCart.remove(itemId);
        } else {
            System.out.println("Please add product first.");
        }
    }

    public void printCartItems() {
        System.out.println("**********Cart Contents**********");
        System.out.format("\n%-10s %-15s %10s %10s %10s\n", "ProductID", "ProductName", "Rate", "Quantity", "Price");
        for (int id : shoppingCart.keySet()) {
            ItemModel item = items.get(id);
            double itemCost = (item.getItemPrice() * shoppingCart.get(id));
            System.out.format("%-10d %-15s %10.2f  %9d %10.2f\n", item.getItemId(), item.getItemName(), item.getItemPrice(), shoppingCart.get(id), itemCost);
        }
    }

    public void generateBill() {
        System.out.println("\n**********Bill**********");
        System.out.format("\n%-10s %-15s %10s %10s %10s\n", "ProductID", "ProductName", "Rate", "Quantity", "Price");
        for (int id : shoppingCart.keySet()) {
            ItemModel item = items.get(id);
            double itemCost = item.getItemPrice() * shoppingCart.get(id);
            System.out.format("%-10d %-15s %10.2f  %9d %10.2f\n", item.getItemId(), item.getItemName(), item.getItemPrice(), shoppingCart.get(id), itemCost);
        }
        System.out.println("\nTotal value added to cart is: " + totalAmount);
    }
}