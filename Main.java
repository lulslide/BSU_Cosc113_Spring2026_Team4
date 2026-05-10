import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager lib = new LibraryManager();
        Scanner sc = new Scanner(System.in);
        
        lib.addItem(new Book("B1", "The Great Gatsby", false));
        lib.addItem(new DVD("D1", "Inception", false));

        while (true) {
            System.out.println("\n--- Library System ---");
            System.out.println("1. View Items\n2. Check Out\n3. Save & Exit");
            System.out.print("Choice: ");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                lib.displayInventory();
            } else if (choice.equals("2")) {
                System.out.print("Enter ID to check out: ");
                String id = sc.nextLine();
                try {
                    lib.processCheckOut(id);
                    System.out.println("Success!");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice.equals("3")) {
                lib.saveToDisk();
                System.out.println("Goodbye!");
                break;
            }
        }
        sc.close();
    }
}
