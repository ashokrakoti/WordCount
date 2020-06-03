import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/avbb/Desktop/amazon project.txt");
        Scanner s = new Scanner(file);
        int wordCount = 0;
        while (s.hasNextLine()) {
            String line = s.nextLine();
          //  String[] list_of_words = (line.split(" "));
            //finds the number of words using the .length operator and updates the wordCount
            wordCount += line.split(" ").length;
           /* for (String i : list_of_words) {
                System.out.println(i);
                wordCount++;
            }*/
        }
        System.out.println("the number of words in the text file is approx " + wordCount + ".");

    }
}
