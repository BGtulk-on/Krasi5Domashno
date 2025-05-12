import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class zad1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println(numbers.size());
    }
}