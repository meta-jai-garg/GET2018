package shoppingcart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Order {

    public static void main(String[] args) {
        CartOrder.items = new HashMap<>();
        CartOrder.items.put(1, new ItemModel(1, "CPU", 10000));
        CartOrder.items.put(2, new ItemModel(2, "UPS", 1200));
        CartOrder.items.put(3, new ItemModel(3, "Monitor", 3000));
        CartOrder.items.put(4, new ItemModel(4, "Keyboard", 200));
        CartOrder.items.put(5, new ItemModel(5, "Mouse", 150));

        CartOrder cart = new CartOrder();
        cart.addItemInCart(1, 2);
        cart.addItemInCart(2, 1);
        cart.addItemInCart(3, 3);
        cart.addItemInCart(4, 2);
        cart.addItemInCart(5, 4);
        cart.removeItemFromCart(2);
        cart.printCartItems();

        cart.generateBill();

    }
}
