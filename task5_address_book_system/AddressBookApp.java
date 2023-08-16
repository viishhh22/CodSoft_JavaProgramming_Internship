import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("Address Book System");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter contact phone number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Enter contact email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter contact address: ");
                    String address = scanner.nextLine();

                    System.out.print("Enter contact notes: ");
                    String notes = scanner.nextLine();

                    addressBook.addContact(name, phoneNumber, email, address, notes);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    System.out.println("Contacts:");
                    addressBook.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter search query: ");
                    String query = scanner.nextLine();
                    System.out.println("Matching Contacts:");
                    addressBook.searchContact(query);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.println();
        }
    }
}
