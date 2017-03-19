package InitDnepr.pset2.vigenere;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 * Created by d1mys1klapo4ka on 19.03.2017.
 */
public class VigenereHelp {

    private int status;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    void massege (int a){

        switch (a){
            case 1:{
                System.out.println("Введите в аргумент ключ - слово для кодирования сообщения.");
                break;
            }
            case 2:{
                System.out.println("Ключ - слово должно содержать только текст.");
                break;
            }
            default:
                break;
        }
    }

    char[] text() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        char[] text = s.toCharArray();

        return text;
    }

    void codingTxt(char[] text, char[] key3){

        int count = 0;
        int key1 = 0;
        int keygen = key3.length;

        char[] key = new char[text.length];

        for (int i = 0, n = text.length; i < n; i++){

            key[i] = key3[count % keygen];

            if (isUpperCase(key[i])){
                key1 = (key[i] - 65);
            }

            if (isLowerCase(key[i])){
                key1 = (key[i] - 97);
            }

            if(isLetter(text[i]) && isUpperCase(text[i])){
                text[i] = (char) ((text[i] - 65 + key1) % 26 + 65);
                count++;
            }

            if (isLetter(text[i])  && isLowerCase(text[i]) ){
                text[i] = (char) ((text[i] - 97 + key1) % 26 + 97);
                count++;
            }

            System.out.print(text[i]);
        }
    }
}
