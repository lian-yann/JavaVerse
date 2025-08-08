//Jabibi Restaurant
import java.util.ArrayList;

public class Main {
    public static void
    main(String[] args) {
        Food m1 = new Food("Chicken Joy", 89.9, "Meal");
        Food m2 = new Food("Spaghetti", 75.00, "Meal");
        Beverages b1 = new Beverages("Unli Coke", 149.9, "Beverages");
        Desserts d1 = new Desserts("Ice Cream", 29.99, "75mg");

        Tray myTray = new Tray();

        myTray.addItem(m1, 2, m1, b1, d1);
        myTray.addItem(m2, 3, m2, b1, d1);
        myTray.addItem(b1, 1, m2, b1, d1);
        myTray.addItem(d1, 2, m2, b1, d1);

        Order myOrder = new Order(myTray);

        myOrder.displayFoodReceipt();
        myOrder.displayBeveragesReceipt();
        myOrder.displayDessertsReceipt();
        myOrder.displayTotal();
        myOrder.displayQuote();

        

    }
}

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }
}

class Food extends Product {
    private String meal;
    Food(String name, double price,String meal) {
        super(name, price);
        this.meal = meal;

    }

    String getDishes() {
        return this.meal;
    }

}

class Beverages extends Product {
    private String flavor;
    Beverages(String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }

    String getFlavor() {
        return this.flavor;
    }
}

class Desserts extends Product {
    private String sugarLevel;
    Desserts(String name, double price, String sugarLevel) {
        super(name, price);
        this.sugarLevel = sugarLevel;
    }

    String getSugarLevel() {
        return this.sugarLevel;
    }
}

class TrayItem {
    private Product product;
    private int qty;
    private Food food;
    private Beverages beverages;
    private Desserts desserts;
    
    TrayItem(Product product, int qty, Food food, Beverages beverages, Desserts desserts){
        this.product = product;
        this.qty = qty;
        this.food = food;
        this.beverages = beverages;
        this.desserts = desserts;
    }
    
    Product getProduct() {
        return this.product;
    }

    Food getFood() {
        return this.food;
    }

    Beverages getBeverages() {
        return this.beverages;
    }

    Desserts getDesserts() {
        return this.desserts;
    }
    int getQuantity() {
        return this.qty;
    }

    double getTotal() {
        return this.qty * product.getPrice();
    }
}

class Tray {
    private ArrayList<TrayItem> items;

    Tray() {
        this.items = new ArrayList<>();
    }

    void addItem (Product product, int qty, Food food, Beverages beverages, Desserts desserts) {
        this.items.add(new TrayItem(product, qty, food, beverages, desserts));
    }
    ArrayList<TrayItem>getItems() { 
        return this.items;
    }
}

class Order {
    private Tray tray;
    private double grandTotal = 0.0;

    Order(Tray tray) {
        this.tray = tray;

    for(TrayItem item : tray.getItems()) {
        grandTotal += item.getTotal();
    }
    }

    double getGrandTotal() {
        return grandTotal;
    }

    void displayFoodReceipt() {
            System.out.printf("===============================\n");
            System.out.printf("Food:\n");
        for(TrayItem item : tray.getItems()) {
            if(item.getProduct() == item.getFood()) {
             System.out.printf("%-20s %.2f * %-12s\n", item.getProduct().getName(),
            item.getProduct().getPrice(),
            item.getQuantity()
            );
            }
        }
    }

    void displayBeveragesReceipt() {
            System.out.printf("===============================\n");
            System.out.printf("Beverage:\n");
        for(TrayItem item : tray.getItems()) {
            if(item.getProduct() == item.getBeverages()) {
             System.out.printf("%-20s %.2f * %-12s\n", item.getProduct().getName(),
            item.getProduct().getPrice(),
            item.getQuantity()
            );
            }
    }
    }

    void displayDessertsReceipt() {
            System.out.printf("===============================\n");
            System.out.printf("Desserts\n");
        for(TrayItem item : tray.getItems()) {
            if(item.getProduct() == item.getDesserts()) {
             System.out.printf("%-20s %.2f * %-12s\n", item.getProduct().getName(),
            item.getProduct().getPrice(),
            item.getQuantity()
            );
            }
    }
    } 
    void displayTotal() {
        System.out.printf("===============================\n");
        System.out.printf("%-20s = %.2f", "Total amount due", getGrandTotal());
    }
    void displayQuote() {
        System.out.println();
        System.out.println("\n\"Craving something? You didn't\nknow you needed it,\nuntil you saw it here.\"");
    }
}
