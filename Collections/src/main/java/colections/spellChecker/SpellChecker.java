package colections.spellChecker;

import java.util.Set;

public class SpellChecker { //corector ortografic
    private Set<String> dictionary;
    private Set<String> wordsToCheck;

    public SpellChecker(Set<String> dictionary, Set<String> wordsToCheck) {
        this.dictionary = dictionary;
        this.wordsToCheck = wordsToCheck;
    }

    public Set<String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    public Set<String> getWordsToCheck() {
        return wordsToCheck;
    }

    public void setWordsToCheck(Set<String> wordsToCheck) {
        this.wordsToCheck = wordsToCheck;
    }
    //Daca scrii un text, fiecare cuvant trebuie cautat in lista de cuvinte cunoscute,
    // iar daca nu este gasit, inseamna ca e eronat.
    //Implementeaza un astfel de spell checker.

    public void searchWord(){

    }
    //    Ce intra in program?
//    Pe prima linie utilizatorul introduce numarul de cuvinte din lista de cuvinte cunoscute.
//            Apoi, pe cate o linie separata introduce fiecare cuvant din lista de cuvinte cunoscute.
//            Apoi, pe o linie, se introduce numarul de linii al textului de verificat.
//            Apoi, se introduc exact atatea linii cu text (cuvinte separate prin spatiu).

//Ce iese din program?
//Trebuie sa afisam acele cuvinte din text care nu se regasesc in lista de cuvinte cunoscute.
// Trebuie sa verificam fara sa tinem cont de literele mici si mari.
// Cuvintele care nu sunt gasite in dictionar nu ar trebui sa fie duplicate, daca le regasim de mai multe ori in text.
}
