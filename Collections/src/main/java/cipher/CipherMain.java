package cipher;

import java.util.ArrayList;
import java.util.List;

public class CipherMain {
    public static void main(String[] args) {
        List<Character> inputChars = new ArrayList<>();
        inputChars.add('a');
        inputChars.add('e');
        inputChars.add('i');
        inputChars.add('o');
        inputChars.add('u');
        inputChars.add('c');
        inputChars.add('n');
        inputChars.add('d');
        inputChars.add('b');
        inputChars.add('s');
        inputChars.add('l');
        inputChars.add('m');
        System.out.println(inputChars);

        List<Character> outputChar = new ArrayList<>();
        outputChar.add('s');
        outputChar.add('t');
        outputChar.add('n');
        outputChar.add('f');
        outputChar.add('g');
        outputChar.add('h');
        outputChar.add('j');
        outputChar.add('k');
        outputChar.add('x');
        outputChar.add('y');
        outputChar.add('z');
        outputChar.add('q');
        System.out.println(outputChar);

        Cipher cipher = new Cipher(inputChars,outputChar);
        System.out.println(cipher.initializeCypher());
        System.out.println(cipher.encrypt("nuca"));
        System.out.println(cipher.decrypt("jghs"));

    }
}
