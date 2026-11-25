
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactLinkedList list = new ContactLinkedList();

        int choice;

        do {
            System.out.println("\n===== CONTACT LIST MANAGER =====");
           System.out.println("1. Add Contact");
           System.out.println("2. Display Contacts");
           System.out.println("3. Search Contact");
           System.out.println("4. Update Contact");
           System.out.println("5. Delete Contact");
           System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    list.addContact(name, phone);
                    break;

                case 2:
                    list.displayContacts();
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String searchName = sc.nextLine();
                    list.searchContact(searchName);
                    break;


                case 4:
                    System.out.print("Enter Old Name: ");
                    String oldName = sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Phone: ");
                    String newPhone = sc.nextLine();

                    list.updateContact(oldName, newName, newPhone);
                    break;


                    case 5:
                    System.out.print("Enter Name to Delete: ");
                    String deleteName = sc.nextLine();
                    list.deleteContact(deleteName);
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;


                  

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice !=6

        );

        sc.close();
    }
}