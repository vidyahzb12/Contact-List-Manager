public class ContactLinkedList {

    class Node {
        Contact data;
        Node next;

        Node(Contact data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Add Contact
    public void addContact(String name, String phone) {

        Contact c = new Contact(name, phone);
        Node newNode = new Node(c);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Contact Added Successfully!");
    }

    // Display Contacts
    public void displayContacts() {

        if (head == null) {
            System.out.println("Contact List is Empty!");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.println("Name: " + temp.data.getName());
            System.out.println("Phone: " + temp.data.getPhone());
            System.out.println("------------------");

            temp = temp.next;
        }
    }

// Search Contact
public void searchContact(String name) {

    Node temp = head;

    while (temp != null) {

        if (temp.data.getName().equalsIgnoreCase(name)) {
            System.out.println("Contact Found!");
            System.out.println("Name: " + temp.data.getName());
            System.out.println("Phone: " + temp.data.getPhone());
            return;
        }

        temp = temp.next;
    }

    System.out.println("Contact Not Found!");
}
 
    public void updateContact(String oldName, String newName, String newPhone) {

    Node temp = head;

    while (temp != null) {

        if (temp.data.getName().equalsIgnoreCase(oldName)) {

            temp.data.setName(newName);
            temp.data.setPhone(newPhone);

            System.out.println("Contact Updated Successfully!");
            return;
        }

        temp = temp.next;
    }

    System.out.println("Contact Not Found!");
}

public void deleteContact(String name) {

    if (head == null) {
        System.out.println("Contact List is Empty!");
        return;
    }

    if (head.data.getName().equalsIgnoreCase(name)) {
        head = head.next;
        System.out.println("Contact Deleted Successfully!");
        return;
    }

    Node temp = head;

    while (temp.next != null) {

        if (temp.next.data.getName().equalsIgnoreCase(name)) {
            temp.next = temp.next.next;
            System.out.println("Contact Deleted Successfully!");
            return;
        }

        temp = temp.next;
    }

    System.out.println("Contact Not Found!");
}

}