package p03_animalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String chickenName = reader.readLine();
        int chickenAge = Integer.parseInt(reader.readLine());

        try {
            Chicken chicken = new Chicken(chickenName, chickenAge);
            System.out.println(chicken);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        //main ends here
    }
}
