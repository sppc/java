import java.util.*;
import java.lang.*;
public class Main {
    String prompt;
    static String strUserResponse;
    public static void main(String[] args){
        //return text;

        System.out.println("Write a text: ");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        System.out.println("Choose a Caesar Chipher key: ");
        int key = input.nextInt();
        System.out.println("Choose a blocks key: ");
        int key1 = input.nextInt();

        encrityString(x, key, key1);

    }
    public static String normalizeText(String text){
        // normalizedText;

        text = text.replace(" ","");
        text = text.replaceAll("[/|!?.,()\"'=;:_^~`´]", "");
        text= text.toUpperCase();

        return text;
    }
    public static String obifyText(String frase)
    {
        frase = frase.replaceAll("(?i)(a|e|i|o|u)", "BO$1");
        return frase;
    }
    public static String cesarifyText(String plainText, int key) {

        char[] plainTextChar = plainText.toCharArray();
        for (int i = 0; i < plainTextChar.length; i++) {
            plainTextChar[i] = (char) (((int) plainTextChar[i] + key - 65) % 26 + 65);
        }
        return String.valueOf(plainTextChar);
    }
    public static String groupifyText(String message, int number) {
        StringBuilder gp = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (i != 0 && i % number == 0) {
                gp.append(' ');
            }
        gp.append(message.charAt(i));
        }
        int pad = message.length() % number;
        for (int i = 0; i < pad; i++) {
            gp.append('x');
        }
        return gp.toString();
    }

    public static void encrityString(String text, int key, int key1) {
       text = normalizeText(text);
       text = obifyText(text);
        text = cesarifyText(text, key );
        text = groupifyText(text, key1);

        System.out.println(text);

    }

}
