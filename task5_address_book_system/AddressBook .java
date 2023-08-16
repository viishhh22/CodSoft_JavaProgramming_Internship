import java.util.ArrayList;

class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber, String email, String address, String notes) {
        Contact contact = new Contact(name, phoneNumber, email, address, notes);
        contacts.add(contact);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact + "\n");
            }
        }
    }

    public void searchContact(String query) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(query.toLowerCase()) ||
                    contact.getPhoneNumber().contains(query) || contact.getEmail().toLowerCase().contains(query.toLowerCase())) {
                System.out.println(contact + "\n");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching contacts found.");
        }
    }
}
