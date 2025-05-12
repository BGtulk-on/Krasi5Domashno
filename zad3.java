import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class zad3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Double> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Double.parseDouble(reader.readLine()));
        }
        
        Collections.sort(numbers);


        double median;
        if (n % 2 == 1) {
            median = numbers.get(n / 2);
        } else {
            median = (numbers.get(n / 2 - 1) + numbers.get(n / 2)) / 2.0;
        }


        System.out.println(median);
    }
}