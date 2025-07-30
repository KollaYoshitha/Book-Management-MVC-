package View;

import java.util.Scanner;
import Model.Contact;
import java.util.List;

public class ContactView {
    Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n--- Address Book Menu ---");
        System.out.println("1. Add Contact");
        System.out.println("2. View All Contacts");
        System.out.println("3. Update Contact by Name");
        System.out.println("4. Delete Contact by Name");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public Contact getContactInput() {
        sc.nextLine();  
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter book name: ");
        String bookName = sc.nextLine();
        return new Contact(name, phone, email, bookName);
    }

    public String getNameInput(String prompt) {
        sc.nextLine();  
        System.out.print(prompt);
        return sc.nextLine();
    }

    public void showContact(Contact c) {
        System.out.println("Name     : " + c.getName());
        System.out.println("Phone    : " + c.getPhone());
        System.out.println("Email    : " + c.getEmail());
        System.out.println("BookName : " + c.getBookName());
        System.out.println("---------------------------");
    }

    public void showAllContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact c : contacts) {
                showContact(c);
            }
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}
