package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Contact;
import View.ContactView;

public class ContactController {
    private List<Contact> contactList = new ArrayList<>();
    private ContactView view;

    public ContactController(ContactView view) {
        this.view = view;
    }

    public void start() {
        boolean running = true;
        while (running) {
            int choice = view.showMenu();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    view.showAllContacts(contactList);
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    running = false;
                    view.showMessage("Exiting...");
                    break;
                default:
                    view.showMessage("Invalid choice!");
            }
        }
    }

    private void addContact() {
        Contact c = view.getContactInput();
        contactList.add(c);
        view.showMessage("Contact added successfully.");
    }

    private void updateContact() {
        String name = view.getNameInput("Enter name of contact to update: ");
        for (Contact c : contactList) {
            if (c.getName().equalsIgnoreCase(name)) {
                Contact updated = view.getContactInput();
                c.setName(updated.getName());
                c.setPhone(updated.getPhone());
                c.setEmail(updated.getEmail());
                c.setBookName(updated.getBookName());
                view.showMessage("Contact updated.");
                return;
            }
        }
        view.showMessage("Contact not found.");
    }

    private void deleteContact() {
        String name = view.getNameInput("Enter name of contact to delete: ");
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equalsIgnoreCase(name)) {
                contactList.remove(i);
                view.showMessage("Contact deleted.");
                return;
            }
        }
        view.showMessage("Contact not found.");
    }
}
