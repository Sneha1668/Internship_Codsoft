import java.util.Scanner;

public class Codsoft_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int wordCount = countWords(sentence);
        System.out.println("Word count: " + wordCount);
    }
    
    public static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}