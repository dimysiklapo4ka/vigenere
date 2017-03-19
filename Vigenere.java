package InitDnepr.pset2.vigenere;


import java.io.IOException;

import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 * Created by d1mys1klapo4ka on 14.03.2017.
 */
public class Vigenere {

    public static void main(String[] args) throws IOException {

        VigenereHelp h = new VigenereHelp();

        if (args.length != 1){
            h.setStatus(1);
            h.massege(h.getStatus());
            return;
        }

        for (int i = 0, n = args[0].length(); i < n; i++){
            if (!isLetter(args[0].charAt(i))){
                h.setStatus(2);
                h.massege(h.getStatus());
                return;
            }
        }

        char[] text = h.text();
        char[] key2 = args[0].toCharArray();
        h.codingTxt(text, key2);
    }
}
