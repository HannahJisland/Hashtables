error id: file://<WORKSPACE>/Hashtable.java:_empty_/i#
file://<WORKSPACE>/Hashtable.java
empty definition using pc, found symbol in pc: _empty_/i#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 742
uri: file://<WORKSPACE>/Hashtable.java
text:
```scala
import java.util.*;

public class Hashtable {
    HashMap<String, ArrayList<Integer>> dictionary = new HashMap<>();
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.run();
    }

    public void run() {
        Scanner scan = new Scanner(System.in);

        int i = 0;

        while (scan.hasNext()) {
            String word = scan.nextLine().trim();
            if (isPresent(word)) {
                word.removeWord();
            }
            }

        scan.close();
    }

    private static boolean isPresent(String s) {
        if (dictionary.containsKey(s)) {
            return true;
        } 
        return false;
    }

    private static boolean removeWord() {
        return (@@i % 16 == 0);

    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/i#