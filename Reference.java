import java.util.*;

public class Reference {
    HashTable<String, Integer> dictionary = new HashTable<>();
    Scanner scan = new Scanner(System.in);
    int i = 0;

    public static void main(String[] args) {
        Reference ref = new Reference();
        ref.run();
    }
    
    public void run() {
        while (scan.hasNextLine()) {
            // Sparar ordet i en variabel och tar bort whitespace
            String word = scan.nextLine().trim();
            boolean isPresent = dictionary.containsKey(word);
            boolean removeIt = i % 16 == 0;

            if (isPresent) {
                if (removeIt) {
                    dictionary.remove(word);
                } else {
                    int value = dictionary.get(word);
                    dictionary.put(word, value + 1);
                } 
            } else if (!removeIt) {
                dictionary.put(word, 1);
            }

            i += 1;
        }

        int maxCount = 0;
        String maxWord = "";

        for (String key : dictionary.keySet()) {
            int value = dictionary.get(key);

            if (value > maxCount || (value == maxCount && key.compareTo(maxWord) < 0)) {
                maxCount = value;
                maxWord = key; 
            }
        }



        System.out.println(maxWord + " " + maxCount);

        scan.close();
    }
}
