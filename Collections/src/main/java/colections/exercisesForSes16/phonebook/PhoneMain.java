package colections.exercisesForSes16.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneMain {
    public static void main(String[] args) {
//        List<String> phones = new ArrayList<>();
//        phones.add("23");
//        phones.add("34");
//        phones.add("56");
//
//        List<String> blackList = new ArrayList<>();
//        blackList.add("33");
//        blackList.add("22");
//        PhoneBook phoneBook = new PhoneBook(phones, blackList);
//        phoneBook.addToBlacklist("23");
//        System.out.println(phoneBook.getPhones());
//        System.out.println(phoneBook.getBlackList());



        List<String> phones2 = new ArrayList<>();
        phones2.add("23");
        phones2.add("34");
        phones2.add("45");
        List<String> blackList2 = new ArrayList<>();
        blackList2.add("23");
        blackList2.add("34");
        List<String> result = PhoneBook.filterContacts(phones2,blackList2);
        System.out.println(result);

    }


}
