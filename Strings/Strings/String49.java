import java.util.Scanner;

/**
 * Created by Пользователь on 25.11.2015.
 */
public class String49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                String s = word.substring(word.length()-1);
                words[i] = word.substring(0, word.length()-1).replaceAll(s, ".")+s;
                result+=words[i]+" ";
            } else {
                result+=" ";
            }
        }
        System.out.println(result.trim());
    }
}
