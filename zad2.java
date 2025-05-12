import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class zad2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            words.add(reader.readLine());
        }

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() % 2 != 0) {
                iterator.remove();
            }
        }







        System.out.println(String.join(" ", words));
    }
}