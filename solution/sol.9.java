package store;
public class stock {
private int item_no;
private String item_name;
private int stock_available;
private double cost;
public stock(int item_no, String item_name, int stock_available, double 
cost) {
this.item_no = item_no;
this.item_name = item_name;
this.stock_available = stock_available;
this.cost = cost;
}
public int getItem_no() {
return item_no;
}
public String getItem_name() {
return item_name;
}
public int getStock_available() {
return stock_available;
}
public double getCost() {
return cost;
}
public void setStock_available(int stock_available) {
this.stock_available = stock_available;

}
public void setCost(double cost) {
this.cost = cost;
}
public String toString() {
return "Item No.: " + item_no + ", Item Name: " + item_name + 
", Stock Available: " + stock_available + ", Cost: " + cost;
}
}
import store.*;
import java.util.ArrayList;
import java.util.Scanner;
public class PRG_04 {
public static void main(String[] args) {
ArrayList<stock> items = new ArrayList<stock>();
items.add(new stock(1, "Apple", 10, 20.0));
items.add(new stock(2, "Banana", 20, 30.0));
items.add(new stock(3, "Ball", 30, 40.0));
Scanner scanner = new Scanner(System.in);
while (true) {
System.out.println("\nCurrent Stock:");
for (stock item : items) {
System.out.println(item);
}
	System.out.print("\nEnter the item no. to add stock, or 0 to 
	exit:");
	int item_no = scanner.nextInt();
	if (item_no == 0) {
	break;}
	stock item = items.stream().filter(i -> 
	i.getItem_no()==item_no).findFirst().orElse(null);
	if (item == null) {
	System.out.println("Invalid item no.");

}
	else 
			{
				System.out.print("\nEnter the quantity to add:");
				int qty = scanner.nextInt();
				item.setStock_available(item.getStock_available() + qty);
				System.out.println("Stock added successfully.");
			}	
		}
	}
}
