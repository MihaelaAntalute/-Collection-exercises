package colections.phoneBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> validContacts = new ArrayList<>();
        validContacts.add("234566");
        System.out.println(validContacts);
        List<String> blackContacts = new ArrayList<>();

        PhoneBook phoneBook = new PhoneBook(validContacts,blackContacts);
        phoneBook.addToBlackList("234566");
        phoneBook.addToBlackList("234000");
        System.out.println(phoneBook.getBlackList());
        System.out.println(phoneBook.getValidContacts());
        phoneBook.removeFromBlackList("234000");
        System.out.println(phoneBook.getBlackList());
        System.out.println(phoneBook.getValidContacts());
    }
}
