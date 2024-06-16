import java.util.Scanner;


public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lexo fjalën nga përdoruesi
        System.out.print("Shkruani një fjalë: ");
        String word = scanner.nextLine();

        // Deklaro variablat për numërimin e zanoreve dhe karaktereve
        int vowelCount = 0;
        int characterCount = 0;

        // Kontrollo karakteret në fjalë
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'ë'|| ch == 'y') {
                vowelCount++;
            }
            characterCount++;
        }

        // Afisho rezultatin
        System.out.println("Numri i zanoreve: " + vowelCount);
        System.out.println("Numri i karaktereve të fjalës: " + characterCount);
    }
}