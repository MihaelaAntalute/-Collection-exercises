package colections.phoneBook;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    void testFilterContacts_ShouldReturnValidContacts() {
        //given
        List<String> validContacts = new ArrayList<>();
        validContacts.add("234566");
        validContacts.add("234554");
        validContacts.add("23000");
        List<String> blackContacts = new ArrayList<>();
        blackContacts.add("234566");
        blackContacts.add("23000");
        //when
        List<String> result = PhoneBook.filterContacts(validContacts, blackContacts);
        //then
        assertEquals(1, result.size());
    }
}
