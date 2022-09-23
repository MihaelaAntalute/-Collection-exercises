package colections.exercisesForSes16.phonebook;

import java.util.List;

public class PhoneBook {

    private List<String> validContacts;
    private List<String> blackList;

    public PhoneBook(List<String> validContacts, List<String> blackList) {
        this.validContacts = validContacts;
        this.blackList = blackList;
    }

    public List<String> getValidContacts() {
        return validContacts;
    }

    public void setValidContacts(List<String> validContacts) {
        this.validContacts = validContacts;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public void addToBlackList(String phoneNumber) {
        validContacts.remove(phoneNumber);
        blackList.add(phoneNumber);
    }

    public static List<String> filterContacts(List<String> validContacts, List<String> blackList) {
        for (String contact : blackList) {
            if (validContacts.contains(contact)) {
                validContacts.remove(contact);
            }
        }
        return validContacts;
    }

    public static List<String> removeFromBlacklist() {
        //TODO to be implemented
        return null;
    }
}
