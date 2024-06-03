import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }
}

class PhoneBook {
    private ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
    for (Contact existingContact : contacts) {
        if (existingContact.getName().equalsIgnoreCase(contact.getName())) {
            System.out.println("A contact with the same name already exists. Cannot add.");
            
        }
    }
    contacts.add(contact);
    
}



    public void modifyContact(String name, Contact newContact) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setName(newContact.getName());
                contact.setPhoneNumber(newContact.getPhoneNumber());
                contact.setEmail(newContact.getEmail());
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void deleteContact(String name) {
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
    }

    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in the phone book.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}


public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        boolean running = true;

        while (running) {
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Modify Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. List Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(name, phoneNumber, email);
                    phoneBook.addContact(contact);
                    System.out.println("Contact added.");
                    break;

                case 2:
                    System.out.print("Enter the name of the contact to modify: ");
                    String oldName = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    Contact newContact = new Contact(newName, newPhoneNumber, newEmail);
                    phoneBook.modifyContact(oldName, newContact);
                    break;

                case 3:
                    System.out.print("Enter the name of the contact to delete: ");
                    String deleteName = scanner.nextLine();
                    phoneBook.deleteContact(deleteName);
                    System.out.println("Contact deleted.");
                    break;

                case 4:
                    phoneBook.listContacts();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting phone book.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}