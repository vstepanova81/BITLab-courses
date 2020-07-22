/*package prvt.vstepanova.Module2.Lesson9.Practice9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DBItem manager = new DBItem();
        manager.connect();

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("PRESS 1 TO ADD ITEM");
            System.out.println("PRESS 2 TO LIST ITEMS");
            System.out.println("PRESS 3 TO DELETE ITEM");
            System.out.println("PRESS 0 TO EXIT");
            String choice = in.next();

            if (choice.equals("1")) {
                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert price:");
                double price = in.nextDouble();
                Item i = new Item(null, name, price);
                manager.addItem(i);

            } else if (choice.equals("2")) {
                ArrayList<Item> item = manager.getAllItems();
                for (Item i : item) {
                    System.out.println(i);
                }

            } else if (choice.equals("3")) {
                System.out.println("Insert id of an item");
                Long id = in.nextLong();
                manager.deleteCar(id);

            } else if (choice.equals("0")) {
                System.exit(0);
            }
        }
    }
}*/