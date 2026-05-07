error id: file://<WORKSPACE>/Hashtable.java:
file://<WORKSPACE>/Hashtable.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 343
uri: file://<WORKSPACE>/Hashtable.java
text:
```scala
import java.util.*;

public class Hashtable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, ArrayList<Integer>> dictionary = new HashMap<>();

        int i = 0;

        while (scan.hasNext()) {
            String word = scan.nextLine().trim();
            word.isPresent@@
                if (dictionary.containsValue(word)) {
                    return true;
                } else {
                    return false;
                }
            }

        scan.close();
    }

    private static boolean isPresent(String s) {
        return true;
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 