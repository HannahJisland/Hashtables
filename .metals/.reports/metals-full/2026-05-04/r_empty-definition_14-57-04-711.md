error id: file://<WORKSPACE>/Hashtable.java:java/lang/String#
file://<WORKSPACE>/Hashtable.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 425
uri: file://<WORKSPACE>/Hashtable.java
text:
```scala
import java.util.*;

public class Hashtable {
    HashMap<String, ArrayList<Integer>> dictionary = new HashMap<>();
    int i = 0;

    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.run();
    }

    public void run() {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            // Sparar ordet i en variabel och tar bort whitespace
            @@String word = scan.nextLine().trim();
            if (!isPresent(word)) {
                word.removeWord();
            } else if () {

            }
            }

  

        private static boolean isPresent(String s) {
            if (dictionary.containsKey(s)) {
                return true;
            } 
            return false;
        }

        private static boolean removeWord() {
            return i % 16 == 0;

        }
        
        scan.close();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#