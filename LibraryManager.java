import java.util.*;
import java.io.*;

public class LibraryManager {
    private Map<String, LibraryItem> inventory = new HashMap<>();
    private final String FILE_NAME = "library_data.txt";

    public void addItem(LibraryItem item) {
        inventory.put(item.getId(), item);
    }

    public void displayInventory() {
        System.out.println("\n--- Current Library Inventory ---");
        if (inventory.isEmpty()) System.out.println("No items found.");
        for (LibraryItem item : inventory.values()) {
            System.out.println(item);
        }
    }

    public void processCheckOut(String id) throws ItemUnavailableException {
        LibraryItem item = inventory.get(id);
        if (item == null) {
            throw new ItemUnavailableException("Error: Item ID " + id + " does not exist.");
        }
        if (item.isCheckedOut()) {
            throw new ItemUnavailableException("Error: " + item.getTitle() + " is already loaned out.");
        }
        item.setCheckedOut(true);
    }

    public void saveToDisk() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (LibraryItem item : inventory.values()) {
                String type = (item instanceof Book) ? "BOOK" : "DVD";
                writer.println(type + "," + item.getId() + "," + item.getTitle() + "," + item.isCheckedOut());
            }
            System.out.println("Data successfully saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("File Error: Could not save data.");
        }
    }
}
